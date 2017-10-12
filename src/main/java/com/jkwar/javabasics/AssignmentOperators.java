package com.jkwar.javabasics;

/**
 * 赋值运算符
 */
public class AssignmentOperators {
  public static void main(String[] args) {
    int a = 2;
    int b = 10;
    System.out.println("--加后赋值--");
    System.out.println(a += b);
    System.out.println("--减后赋值--");
    System.out.println(a -= b);
    System.out.println("--乘后赋值--");
    System.out.println(a *= b);
    System.out.println("--整除后赋值--");
    System.out.println(a /= b);
    System.out.println("--取模后赋值--");
    System.out.println(a %= b);
  }
}
