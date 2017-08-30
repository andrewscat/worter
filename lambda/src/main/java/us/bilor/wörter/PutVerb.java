package us.bilor.wörter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import us.bilor.wörter.pojo.Verb;
import us.bilor.wörter.pojo.VerbRequest;
import us.bilor.wörter.pojo.Rezult;

public class PutVerb implements RequestHandler<Verb, Rezult> {

  @Override
  public Rezult handleRequest(Verb newVerb, Context context) {
    Rezult rezult = new Rezult();
    rezult.setStatus("ok");
    return rezult;
  }
}