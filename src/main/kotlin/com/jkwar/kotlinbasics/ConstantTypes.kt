package com.jkwar.kotlinbasics

val myBinarySystem = 7
val myBinarySystemBig = 7

val octalNumberSystem = "kotlin 不支持八进制"

val decimalSystem = 123123
val decimalSystemLong = 123123L

val duodecimal = 0x123
val deadening = 0X123

val mDouble = 5.0
val mFloat = 5.0

val aTrue = true
val aFalse = false

val aChar = 'a'

val aString = "HelloWorld"

//数字字面值中的下划线
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

/**
 * 演示Java中的所有类型的常量 程序当中输出： 输出整数常量、 小数常量、 布尔常量、 字符常量、 字符串常量。
 */

fun main(args: Array<String>) {
  println("输出二进制整数常量 以0b(0B)开头")
  println(myBinarySystem)
  println(myBinarySystemBig)
  println("输出八进制整数常量 以0开头 kotlin 不支持八进制")
  println(octalNumberSystem)
  println("输出十进制整数常量 正常数字")
  println(decimalSystem)
  println(decimalSystemLong)
  println("输出十六进制整数常量 以0x(0X)开头")
  println(duodecimal)
  println(deadening)
  println("小数常量 默认 double Float 用 f 或者 F 标记")
  println(mDouble)
  println(mFloat)
  println("布尔常量 只有2个值，true，false 关键字")
  println(aTrue)
  println(aFalse)
  println("字符常量")
  println(aChar)
  println("字符串常量")
  println(aString)
  println("数字字面值中的下划线")
  println(oneMillion)
  println(creditCardNumber)
  println(socialSecurityNumber)
  println(hexBytes)
  println(bytes)
}