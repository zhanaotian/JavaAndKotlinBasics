package com.jkwar.javabasics;

/**
 * 逻辑运算符
 */
public class LogicalOperator {
  public static void main(String[] args) {
    boolean t = true;
    boolean f = false;
    System.out.println("--与--");
    System.out.println(t & f);
    System.out.println("--或--");
    System.out.println(t | f);
    System.out.println("--异或--");
    System.out.println(t ^ f);
    System.out.println("--非--");
    System.out.println(!t);
    System.out.println("--短路与--");
    System.out.println(t && f);
    System.out.println("--短路或--");
    System.out.println(t || f);
  }
}
