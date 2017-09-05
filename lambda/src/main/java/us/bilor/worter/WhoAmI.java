package us.bilor.worter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import us.bilor.worter.pojo.Verb;
import us.bilor.worter.pojo.VerbRequest;
import us.bilor.worter.pojo.UserIdentity;

public class WhoAmI implements RequestHandler<Verb, UserIdentity> {

  @Override
  public UserIdentity handleRequest(Verb newVerb, Context context) {

    LambdaLogger logger = context.getLogger();
    logger.log(String.format("got request"));

    UserIdentity user = new UserIdentity();
    CognitoIdentity identity = context.getIdentity();
    if (identity == null || identity.getIdentityId() == null || identity.getIdentityPoolId() == null) {
      logger.log(String.format("cognito identity is null, set defaults to responce"));
      user.setIdentityId("undefined id");
      user.setIdentityPoolId("undefined pool id");
    } else {
      logger.log(String.format("cognito identity is ok, returning in responce"));
      user.setIdentityId(identity.getIdentityId());
      user.setIdentityPoolId(identity.getIdentityPoolId());
    }

    return user;
  }
}
