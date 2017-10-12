package com.jkwar.javabasics;

/**
 * 三元运算符
 */
public class TernaryOperator {
  public static void main(String[] args) {
    System.out.println("--方式一--");
    System.out.println(3 > 2 ? "大于" : "小于");

    System.out.println("--方式二--");
    int a = 3;
    int b = 4;
    String result = (a == b) ? "相等" : "不相等";
    System.out.println(result);

    System.out.println("--方式二--");
    int n = (3 > 2 && 4 > 6) ? 100 : 200;
    System.out.println(n);
  }
}
