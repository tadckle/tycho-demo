package tychodemo.bundle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {

  @Test
  public void testName() {
    assertEquals("Alex", My.name());
  }

}
