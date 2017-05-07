package com.ctrip.ch02;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;

public class TestStream {
  @Test
  public void testReduce() {
    int count = Stream.of(1,2,3).reduce(0, (x, y) -> {x = x +1; return x + y;});
    Assert.assertEquals(9, count);
    List<Integer> list = Arrays.asList(1,2,2,3,2);
    Set<Integer> set = list.stream().filter(value -> value >=2).collect(Collectors.toSet());
    Assert.assertEquals(new HashSet<>(Arrays.asList(2,3)), set);
  }
}
