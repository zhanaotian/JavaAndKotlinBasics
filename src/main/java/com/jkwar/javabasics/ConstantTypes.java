package com.jkwar.javabasics;

/**
 * 演示Java中的所有类型的常量 程序当中输出： 输出整数常量 小数常量 布尔常量 字符常量 字符串常量 以及定义常量的几种方法
 */
public class ConstantTypes {
  static final String day = "saturday";

  public static void main(String[] args) {
    final int myBinarySystem = 0b111;
    final int myBinarySystemBig = 0B111;

    System.out.println("输出二进制整数常量 以0b(0B)开头");
    System.out.println(myBinarySystem);
    System.out.println(myBinarySystemBig);

    final int octalNumberSystem = 0_1;
    System.out.println("输出八进制整数常量 以0开头");
    System.out.println(octalNumberSystem);

    final int decimalSystem = 123123;
    final Long decimalSystemLong = 123123L;
    System.out.println("输出十进制整数常量 正常数字");
    System.out.println(decimalSystem);
    System.out.println(decimalSystemLong);

    final int duodecimal = 0x123;
    final int deadening = 0X123;
    System.out.println("输出十六进制整数常量 以0x(0X)开头");
    System.out.println(duodecimal);
    System.out.println(deadening);

    final double mDouble = 5.0;
    final double mFloat = 5.0f;
    System.out.println("小数常量 默认 double Float 用 f 或者 F 标记");
    System.out.println(mDouble);
    System.out.println(mFloat);

    final Boolean aTrue = true;
    final Boolean aFalse = false;
    System.out.println("布尔常量 只有2个值，true，false 关键字");
    System.out.println(aTrue);
    System.out.println(aFalse);

    final char aChar = 'a';
    System.out.println("字符常量");
    System.out.println(aChar);

    final String aString = "HelloWorld";
    System.out.println("字符串常量");
    System.out.println(aString);

    System.out.println("接口(Interface)的中变量默认为static final");
    System.out.println(day.equalsIgnoreCase(ConstantInterface.SATURDAY));
    System.out.println("Java 5.0中引入的Enum类型");
    System.out.println(day.equalsIgnoreCase(ConstantEnum.SATURDAY.name()));
    System.out.println("普通类中使用static final修饰变量");
    System.out.println(day.equalsIgnoreCase(ConstantClassField.SATURDAY));
    System.out.println("普通类中使用static final修饰变量的方法，并通过函数来获取常量");
    System.out.println(day.equalsIgnoreCase(ConstantClassFunction
        .getSaturday()));
  }
}

/**
 * 采用接口(Interface)的中变量默认为static final的特性。
 */
interface ConstantInterface {
  String SUNDAY = "SUNDAY";
  String MONDAY = "MONDAY";
  String TUESDAY = "TUESDAY";
  String WEDNESDAY = "WEDNESDAY";
  String THURSDAY = "THURSDAY";
  String FRIDAY = "FRIDAY";
  String SATURDAY = "SATURDAY";
}

/**
 * 采用了Java 5.0中引入的Enum类型
 */
enum ConstantEnum {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * 采用了在普通类中使用static final修饰变量的方法
 */
class ConstantClassField {
  ConstantClassField() {

  }

  public static final String SUNDAY = "SUNDAY";
  public static final String MONDAY = "MONDAY";
  public static final String TUESDAY = "TUESDAY";
  public static final String WEDNESDAY = "WEDNESDAY";
  public static final String THURSDAY = "THURSDAY";
  public static final String FRIDAY = "FRIDAY";
  public static final String SATURDAY = "SATURDAY";
}

/**
 * 采用了在普通类中使用static final修饰变量的方法，并通过函数来获取常量
 */
class ConstantClassFunction {
  ConstantClassFunction() {

  }

  private static final String SUNDAY = "SUNDAY";
  private static final String MONDAY = "MONDAY";
  private static final String TUESDAY = "TUESDAY";
  private static final String WEDNESDAY = "WEDNESDAY";
  private static final String THURSDAY = "THURSDAY";
  private static final String FRIDAY = "FRIDAY";
  private static final String SATURDAY = "SATURDAY";

  public static String getSunday() {
    return SUNDAY;
  }

  public static String getMonday() {
    return MONDAY;
  }

  public static String getTuesday() {
    return TUESDAY;
  }

  public static String getWednesday() {
    return WEDNESDAY;
  }

  public static String getThursday() {
    return THURSDAY;
  }

  public static String getFirday() {
    return FRIDAY;
  }

  public static String getSaturday() {
    return SATURDAY;
  }
}
