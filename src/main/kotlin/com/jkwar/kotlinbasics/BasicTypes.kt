package com.jkwar.kotlinbasics

/**
 * 基本数据类型
 */
fun main(args: Array<String>) {
  //内存中1个字节， 范围：-128 127
  val b: Byte = 100
  println("定义整数类型 字节类型 Byte类型")
  println(b)
  println("最大值" + Byte.MAX_VALUE)
  println("最小值" + Byte.MIN_VALUE)

  //内存中2个字节， -32768 32767
  val s: Short = 200
  println("定义整数类型 短整数类型 Short类型")
  println(s)
  println("最大值" + Short.MAX_VALUE)
  println("最小值" + Short.MIN_VALUE)

  //内存中4个字节， -2147483648  2147483647
  val i: Int = 100000
  println("定义整数类型 整类型 Int类型")
  println(i)
  println("最大值" + Int.MAX_VALUE)
  println("最小值" + Int.MIN_VALUE)

  //内存中8个字节， -32768 32767
  val l: Long = 1000000L
  println("定义整数类型 成整数类型 long类型")
  println(l)
  println("最大值" + Long.MAX_VALUE)
  println("最小值" + Long.MIN_VALUE)

  //内存中4个字节
  val f: Float = 1.0f
  println("定义浮点数据， 单精度 float类型")
  println(f)
  println("最大值" + Float.MAX_VALUE)
  println("最小值" + -Float.MAX_VALUE)

  //内存中8个字节
  val d: Double = 2.0
  println("定义浮点数据， 双精度 Double类型")
  println(d)
  println("最大值" + Double.MAX_VALUE)
  println("最小值" + -Double.MAX_VALUE)

  //内存中2个字节, 必须单引号包裹,只能写1个字符
  val c: Char = 'a'
  println("定义字符类型, char")
  println(c)

  //内存中1个字节, 数据值, true false
  val bl: Boolean = false
  println("定义布尔类型, boolean")
  println(bl)

  //String 属于引用类型,定义方式,和基本类型一样
  val string: String = "我爱\tjava"
  println("定义变量,字符串类型,数据类型 String 表示字符串的数据类型")
  println(string)
}