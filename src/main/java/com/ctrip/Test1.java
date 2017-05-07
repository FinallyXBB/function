//package com.ctrip;
//
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//import javax.swing.JButton;
//
//public class Test1 {
//
//  public static void main(String[] args) {
//    //Runnable target = () -> System.out.println("hello");
//    new Thread(() -> System.out.println("hello")).start();
//    BinaryOperator<Long> add = new BinaryOperator<Long>() {
//
//      @Override
//      public Long apply(Long t, Long u) {
//        return t + u;
//      }
//    };
//    Predicate<Integer> pre = x -> x > 5;
//    System.out.println(pre.test(10));
//
//    Function<Long, Long> func = (x) -> x + 1;
//    System.out.println(func.apply(11L));
////    func.apply(10L);
//    JButton button = new JButton();
//    button.addActionListener(event -> System.out.println(event.getActionCommand()));
//
//    check((Integer value) -> value > 0);
//  }
//
//  public static interface IntPred {
//    boolean test(Long value);
//  }
//
//  public static void check(IntPred predicete) {
//    System.out.println(predicete.test(1L));
//  }
//
//  public static void check(Predicate<Integer> predicete) {
//    System.out.println(predicete.test(1));
//  }
//}
