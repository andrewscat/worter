package us.bilor.wörter;

import org.junit.Test;
import static org.junit.Assert.*;
import com.amazonaws.services.lambda.runtime.Context;
import us.bilor.wörter.aws.mock.MockContext;
public class TestWord {

  private Context getContext() {
    return new MockContext();
  }

  @Test
  public void assertThatWordIsAdded() {
    Word word = new Word();
    Context ctx = new MockContext();
    assertEquals("", word.addWord("", ctx));
  }
}