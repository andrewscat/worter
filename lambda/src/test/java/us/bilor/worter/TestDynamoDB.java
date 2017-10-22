package us.bilor.worter;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.regions.Regions;
import com.amazonaws.regions.RegionUtils;

public class TestDynamoDB {

  // private final String ENV_ENDPOINT = "http://localhost:8000";
  // private final String ENV_REGION = "eu-central-1";
  // private final String ENV_LOCAL = "YES";

  private ConfigValues configMock;
  private DynamoDB dynamo;

  // @BeforeClass
  // public void setEnv() {
  //   configMock = mock(ConfigValues.class);
  // }

  @Before
  public void setUpConfig() {
    configMock = mock(ConfigValues.class);
    dynamo = new DynamoDB();
    dynamo.config = this.configMock;
  }

  @Test
  public void getClientShouldReturnRemoteClient() {
    when(configMock.isLocalDynamoDB()).thenReturn(false);
    for (Regions region : Regions.values()) {
      when(configMock.getRegion()).thenReturn(region);
      AmazonDynamoDB expectedClient = AmazonDynamoDBClientBuilder.standard()
        .withRegion(region)
        .build();
      System.out.println(RegionUtils.getRegionsForService(expectedClient.ENDPOINT_PREFIX));
      assertEquals(expectedClient.ENDPOINT_PREFIX, dynamo.getClient().ENDPOINT_PREFIX);
    }
  }
}