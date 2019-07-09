package tychodemo.bundle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

  private Hello hello = new Hello();

  @Test
  public void testHello() {
    assertEquals("Hello Alex", hello.say("Alex"));
  }

}
