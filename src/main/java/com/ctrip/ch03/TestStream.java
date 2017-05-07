package com.ctrip.ch03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestStream {
  public static void main(String[] args) {
    List<String> collected = Stream.of("a", "1b", "c").collect(Collectors.toList());
    System.out.println(collected);

    List<String> filterList = Stream.of("a", "1b", "c").filter(value -> isDigit(value.charAt(0)))
        .collect(Collectors.toList());
    System.out.println(filterList);

    List<String> upcaseList = Stream.of("a", "1b", "c").map(value -> value.toUpperCase())
        .collect(Collectors.toList());
    System.out.println(upcaseList);
  }

  private static boolean isDigit(char charAt) {
    if ('0' <= charAt && '9' >= charAt) {
      return true;
    }
    return false;
  }
}
