package us.bilor.worter.aws.mock;

import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
public class MockContext implements Context {

  private static final String REQUEST_ID = "REQUEST_ID";
  private static final ClientContext CLIENT_CONTEXT = null;
  private static final String FUNCTION_NAME = "FUNCTION_NAME";
  private static final String FUNCTION_VERSION = "FUNCTION_VERSION";
  private static final CognitoIdentity IDENTITY = new MockCognitoIdentity();
  private static final String INVOKED_FUNCTION_ARN = "INVOKED_FUNCTION_ARN";
  private static final LambdaLogger LAMBDA_LOGGER = null;
  private static final String LOG_GROUP_NAME = "LOG_GROUP_NAME";
  private static final String LOG_STREAM_NAME = "LOG_STREAM_NAME";
  private static final int MEMORY_LIMIT = 128;
  private static final int REMAINING_TIME = 60;

  public MockContext() {
  }

  public String getAwsRequestId() {
    return REQUEST_ID;
  }

  public ClientContext getClientContext() {
    return CLIENT_CONTEXT;
  }

  public String getFunctionName() {
    return FUNCTION_NAME;
  }

  public String getFunctionVersion() {
    return FUNCTION_VERSION;
  }
  public CognitoIdentity getIdentity() {
    return IDENTITY;
  }

  public String	getInvokedFunctionArn() {
    return INVOKED_FUNCTION_ARN;
  }

  public LambdaLogger	getLogger() {
    return LAMBDA_LOGGER;
  }

  public String	getLogGroupName() {
    return LOG_STREAM_NAME;
  }

  public String	getLogStreamName() {
    return LOG_STREAM_NAME;
  }

  public int	getMemoryLimitInMB() {
    return MEMORY_LIMIT;
  }

  public int	getRemainingTimeInMillis() {
    return REMAINING_TIME;
  }

}