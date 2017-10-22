package us.bilor.worter;

import com.amazonaws.regions.Regions;
import java.net.URL;
import java.net.MalformedURLException;

public class ConfigValues {
  public final static String ENV_DYNAMODB_REGION = "DYNAMODB_REGION";
  public final static String ENV_DYNAMODB_LOCAL = "DYNAMODB_LOCAL";
  public final static String ENV_DYNAMODB_ENDPOINT = "DYNAMODB_ENDPOINT";

  public Regions getRegion() {
    return Regions.fromName(System.getenv(ENV_DYNAMODB_REGION));
  }

  public URL getEndpoint() {
    URL url = null;
    try {
      url = new URL(System.getenv(ENV_DYNAMODB_ENDPOINT));
    } catch(MalformedURLException e) {
      // TODO: replace it with log message and set URL to default or something
      System.out.println(e.toString());
    }
    return url;
  }

  public boolean isLocalDynamoDB() {
    return System.getenv(ENV_DYNAMODB_LOCAL) != "";
  }
}