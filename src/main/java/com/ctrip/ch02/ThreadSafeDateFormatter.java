package com.ctrip.ch02;

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

public class ThreadSafeDateFormatter {
  public static ThreadLocal<DateFormatter> dateFormatter =
      ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("yyyy-MM-dd")));
}
