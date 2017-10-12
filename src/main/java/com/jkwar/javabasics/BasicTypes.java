package com.jkwar.javabasics;

/**
 * 打印所有基本数据类型 定义整数类型 byte ，short ， int  ， long 浮点类型 doule  float 字符类型 char
 */
public class BasicTypes {
  public static void main(String[] args) {
    //内存中1个字节， 范围：-128 127
    byte b = 100;
    System.out.println("定义整数类型 字节类型 byte类型");
    System.out.println(b);
    System.out.println("最大值" + Byte.MAX_VALUE);
    System.out.println("最小值" + Byte.MIN_VALUE);

    //内存中2个字节， -32768 32767
    short s = 200;
    System.out.println("定义整数类型 短整数类型 short类型");
    System.out.println(s);
    System.out.println("最大值" + Short.MAX_VALUE);
    System.out.println("最小值" + Short.MIN_VALUE);

    //内存中4个字节， -2147483648  2147483647
    int i = 100000;
    System.out.println("定义整数类型 整类型 int类型");
    System.out.println(i);
    System.out.println("最大值" + Integer.MAX_VALUE);
    System.out.println("最小值" + Integer.MIN_VALUE);

    //内存中8个字节， -9223372036854775808 9223372036854775807
    long l = 1000000l;
    System.out.println("定义整数类型 长整数类型 long类型");
    System.out.println(l);
    System.out.println("最大值" + Long.MAX_VALUE);
    System.out.println("最小值" + Long.MIN_VALUE);

    //内存中4个字节  -3.4028235E38 3.4028235E38
    float f = 1.0F;
    System.out.println("定义浮点数据， 单精度 float类型");
    System.out.println(f);
    System.out.println("最大值" + Float.MAX_VALUE);
    System.out.println("最小值" + -Float.MAX_VALUE);

    //内存中8个字节 -1.7976931348623157E308  1.7976931348623157E308
    Double d = 2.0;
    System.out.println("定义浮点数据， 双精度 Double类型");
    System.out.println(d);
    System.out.println("最大值" + Double.MAX_VALUE);
    System.out.println("最小值" + -Double.MAX_VALUE);

    //内存中2个字节, 必须单引号包裹,只能写1个字符
    char c = 'a';
    System.out.println("定义字符类型, char");
    System.out.println(c);

    //内存中1个字节, 数据值, true false
    Boolean bl = false;
    System.out.println("定义布尔类型, boolean");
    System.out.println(bl);

    //String 属于引用类型,定义方式,和基本类型一样
    String string = "我爱\njava";
    System.out.println("定义变量,字符串类型,数据类型 String 表示字符串的数据类型");
    System.out.println(string);
  }
}
