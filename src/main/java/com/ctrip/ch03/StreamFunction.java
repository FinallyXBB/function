package com.ctrip.ch03;

import java.util.stream.Stream;

public class StreamFunction {
  public int addUp(Stream<Integer> numbers) {
    return numbers.reduce(0, (x, y) -> x + y);
  }

//  public
}
