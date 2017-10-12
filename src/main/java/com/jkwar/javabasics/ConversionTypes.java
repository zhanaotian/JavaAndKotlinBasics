package com.jkwar.javabasics;

/**
 * Java类型转换： 隐式转换 显式转换
 */
public class ConversionTypes {
  public static void main(String[] args) {
    double d = 1000;
    System.out.println("隐式转换 int 转换成 double");
    System.out.println(d);

    int i = (int) 6666.66;
    System.out.println("显式转换");
    System.out.println(i);
  }
}
