package com.jkwar.javabasics;

/**
 * 流程控制
 */
public class FlowControl {
  public static void main(String[] args) {
    System.out.println("--if语句第一种格式--");
    int i = 5;
    int j = 10;
    //对变量i进行if判断
    if (i > 4) {
      System.out.println("if中的条件是true");
      i++;
    }
    System.out.println(i);

    System.out.println("--if语句第二种格式--");
    //判断变量,是奇偶数, 除以2,看余数是0还是1
    if (i % 2 == 0) {
      System.out.println(i + " 是偶数");
    } else {
      System.out.println(i + " 是奇数");
    }

    System.out.println("--if语句第三种格式--");
    //成绩判断要求 ,成绩>80  成绩>70  成绩>60  不及格
    //定义变量,保存成绩
    int grade = 75;
    //使用if else if 语句对成绩判断
    if (grade >= 80) {
      System.out.println(grade + " 成绩是优");
    } else if (grade >= 70) {
      System.out.println(grade + " 成绩是良");
    } else if (grade > 60) {
      System.out.println(grade + " 成绩是中");
    } else {
      System.out.println(grade + " 成绩是差");
    }

    System.out.println("--while循环--");
    //输出 1-4之间的整数
    //定义变量,整数类型, 循环的条件
    while (i < 10) {
      System.out.println(i);
      i++;
    }

    System.out.println("--switch语句--");
    int week = 5;
    switch (week) {
      case 1:
        System.out.println("星期一");
        break;
      case 2:
        System.out.println("星期二");
        break;
      case 3:
        System.out.println("星期三");
        break;
      case 4:
        System.out.println("星期四");
        break;
      case 5:
        System.out.println("星期五");
        break;
      case 6:
        System.out.println("星期六");
        break;
      case 7:
        System.out.println("星期天");
        break;
      default:
        System.out.println("输入的数字不正确...");
        break;
    }

    System.out.println("--for循环--");
    //for循环,输出0-10
    for (int c = 0; c < 11; c++) {
      System.out.println(i);
    }

    // 定义变量,记录求和后的数据
    int sum = 0;
    // 利用循环,将变量从1变化到4
    for (int a = 1; a <= 4; a++) {
      //对变量进行求和
      sum = sum + i;
    }

    System.out.println(sum);

    System.out.println("--三元运算符--");
    //使用三元运算实现
    int k = i > j ? i : j;
    System.out.println(k + " 是最大值");

    do {
      i++;
      System.out.println(i);
    } while (i < 10);

    System.out.println("--嵌套for循环--");
    for (int c = 0; c < 9; c++) {
      for (int g = 0; g < c + 1; g++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println("-- break语句 --");
    for (int g = 1; g < 10; g++) {
      if (g % 3 == 0) {
        break;
      }
      System.out.println(g);
    }
    System.out.println("-- continue 语句 --");
    for (int l = 1; l < 10; l++) {
      if (l % 3 == 0) {
        continue;
      }
      System.out.println(l);
    }
    System.out.println("-- return 语句 --");
    for (int l = 1; l < 10; l++) {
      if (l % 3 == 0) {
        return;
      }
      System.out.println(l);
    }
  }
}
