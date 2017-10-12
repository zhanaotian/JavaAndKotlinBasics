package com.jkwar.kotlinbasics

fun main(args: Array<String>) {
  val i = 8
  if (i in 1..10) { // 等同于 1 <= i && i <= 10
    println(i)
  }
  println("--输出 1234--")
  for (i in 1..9) println(i)
  println("-- 什么都不输出 --")
  for (i in 9..1) println(i)
  println("-- 倒序迭代数字 --")
  for (i in 9 downTo 1) println(i)
  println("-- 以不等于 2 的任意步长迭代数字 --")
  for (i in 1..9 step 2) println(i)
  println("-- 创建一个不包括其结束元素的区间 --")
  for (i in 1 until 9) println(i)

}