package main;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import junit.framework.TestCase;
import tychodemo.bundle.Hello;

public class LastTEST1Test extends TestCase {
  private Hello hello = new Hello();

  @Test
  public void testLeave() {
    assertEquals("Hello Alex", hello.say("Alex"));
  }

  @Test
  public void testListSize() {
    List<String> list = Lists.newArrayList("A", "B");
    assertEquals(2, list.size());
  }

}
