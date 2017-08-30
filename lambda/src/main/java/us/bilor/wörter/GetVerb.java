package us.bilor.wörter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import us.bilor.wörter.pojo.Verb;
import us.bilor.wörter.pojo.VerbRequest;;

public class GetVerb implements RequestHandler<VerbRequest, Verb> {

  @Override
  public Verb handleRequest(VerbRequest verbRequest, Context context) {
    Verb verb = new Verb();
    verb.setVerb(verbRequest.getVerb());
    return verb;
  }
}