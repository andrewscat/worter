package us.bilor.worter;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.client.builder.AwsClientBuilder;



public class DynamoDB {

  protected ConfigValues config;

  public DynamoDB() {
    config = new ConfigValues();
  }
  
  public AmazonDynamoDB getClient() {
    if (config.isLocalDynamoDB()) {
      return getLocalClient();
    }

    return getRemoteClient();
  }

  private AmazonDynamoDB getRemoteClient() {
    return AmazonDynamoDBClientBuilder.standard()
      .withRegion(config.getRegion())
      .build();
  }


  private AmazonDynamoDB getLocalClient() {
    return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
      new AwsClientBuilder.EndpointConfiguration(config.getEndpoint().toString(), config.getRegion().toString()))
      .build();
  }
}