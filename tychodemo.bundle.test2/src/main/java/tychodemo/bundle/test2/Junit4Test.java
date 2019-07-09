package tychodemo.bundle.test2;

import org.junit.Test;

import junit.framework.TestCase;

public class Junit4Test extends TestCase {

  @Test
  public void testLeave() {
    assertEquals("haha", "ha" + "ha");
  }

}
