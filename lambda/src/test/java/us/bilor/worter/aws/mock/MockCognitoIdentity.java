package us.bilor.worter.aws.mock;

import com.amazonaws.services.lambda.runtime.CognitoIdentity;;
public class MockCognitoIdentity implements CognitoIdentity {

  private static final String ID = "mockCognitoIdentityId";
  private static final String POOLID = "mockCognitoIdentityPoolId";

  public String	getIdentityId() {
    return ID;
  }

  public String	getIdentityPoolId() {
    return POOLID;
  }
}