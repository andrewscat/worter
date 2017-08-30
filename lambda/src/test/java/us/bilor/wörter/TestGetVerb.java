package us.bilor.wörter;

import org.junit.Test;
import static org.junit.Assert.*;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import us.bilor.wörter.aws.mock.MockContext;
import us.bilor.wörter.pojo.VerbRequest;
import us.bilor.wörter.pojo.Verb;

public class TestGetVerb {


  @Test
  public void assertThatVerbsAreEqual() {
    RequestHandler handler = new GetVerb();
    Context ctx = new MockContext();
    VerbRequest request = new VerbRequest();
    String verb = "haben";
    request.setVerb(verb);

    Verb response = null;
    try {
      response = (Verb)handler.handleRequest(request, ctx);
    } catch (ClassCastException e) {
      fail("can not cast handlers response to Verb object");
    }

    assertEquals(verb, response.getVerb());
    }
}