package com.ctrip.ch02;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class TestThreadSafeDateFormatter {
  @Test
  public void testDate() {
    Calendar c = Calendar.getInstance();
    c.setTimeInMillis(System.currentTimeMillis());
    Assert.assertEquals("2017-05-07",
    ThreadSafeDateFormatter.dateFormatter.get().getFormat().format(c.getTime()));
  }
}
