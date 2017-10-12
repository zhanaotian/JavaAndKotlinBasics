package com.jkwar.javabasics;

/**
 * 算数运算符
 */
public class ArithmeticOperator {
  public static void main(String[] args) {
    int a = 2;
    int b = 8;
    System.out.println("--加号运算--");
    System.out.println(+a);
    System.out.println(a + b);
    System.out.println("连接字符串" + a + b);
    System.out.println("--负号运算--");
    System.out.println(-a);
    System.out.println(b - a);
    System.out.println("--乘号运算--");
    System.out.println(a * b);
    System.out.println("--除法运算--");
    System.out.println(b * a);
    System.out.println("--取模运算--");
    System.out.println(b % a);

    System.out.println("--自增运算--");
    int i = 5;
    int j = i++;
    System.out.println(i);
    System.out.println(j);

    int m = 5;
    int n = ++m;
    System.out.println(m);
    System.out.println(n);
    System.out.println("--自减运算--");
    int c = 5;
    int d = c--;
    System.out.println(c);
    System.out.println(d);

    int e = 5;
    int f = --e;
    System.out.println(e);
    System.out.println(f);
  }
}
