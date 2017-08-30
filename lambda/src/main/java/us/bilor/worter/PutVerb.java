package us.bilor.worter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import us.bilor.worter.pojo.Verb;
import us.bilor.worter.pojo.VerbRequest;
import us.bilor.worter.pojo.Rezult;
import com.amazonaws.regions.Regions;

public class PutVerb implements RequestHandler<Verb, Rezult> {

  /*private DynamoDB dynamoDb;
  private String DYNAMODB_TABLE_NAME = "Verb";
  private Regions REGION = Regions.EU_CENTRAL_1;
  */
  @Override
  public Rezult handleRequest(Verb newVerb, Context context) {
    /*AmazonDynamoDBClient client = new AmazonDynamoDBClient();
    client.setRegion(Region.getRegion(REGION));
    this.dynamoDb = new DynamoDB(client);
    */
    Rezult rezult = new Rezult();
    rezult.setStatus("ok");
    rezult.setError("no error");
    return rezult;
  }
}