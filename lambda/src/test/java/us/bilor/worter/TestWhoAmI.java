package us.bilor.worter;

import org.junit.Test;
import static org.junit.Assert.*;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import us.bilor.worter.aws.mock.MockContext;
import us.bilor.worter.pojo.VerbRequest;
import us.bilor.worter.pojo.Verb;

public class TestWhoAmI {


  @Test
  public void assertThatVerbsAreEqual() {
    assertEquals("", "");
  }
}

