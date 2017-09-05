package us.bilor.worter.pojo;

public class UserIdentity {

  private String Id;
  private String PoolId;

  public String getIdentityId() {
    return Id;
  }

  public String getIdentityPoolId() {
    return PoolId;
  }

  public void setIdentityId(String id) {
    this.Id = id;
  }

  public void setIdentityPoolId(String poolId) {
    this.PoolId = poolId;
  }
}
