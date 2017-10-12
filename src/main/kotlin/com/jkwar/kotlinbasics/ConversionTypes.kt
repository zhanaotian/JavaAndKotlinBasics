package com.jkwar.kotlinbasics

/**
 * Kotlin 类型转换：显示转换、Kotlin不支持隐式转换，但是支持类型检查。
 * 智能类型转换：
 * 1. Java style 类型转换（不安全的类型转换）
 * 2. 安全类型转换
 * 3. 智能安全类型转换
 */

val obj: Any = "我爱我家"

fun main(args: Array<String>) {
  val i = 10.2.toInt()
  println("显式转换")
  println(i)

  //val d: Double = 1000
  println("不支持隐式转换")

  val l = 1L + 3
  println("类型推导")
  println(l)

  //val sub: Int = 10.2 as Int //类似Java的类型转换，失败则抛出异常
  println("Java style 类型转换（不安全的类型转换）")
  //println(sub)

  val sub1: Int? = 10.2 as? Int
  println("安全类型转换")
  println(sub1)

  println("智能类型转换")
  if (obj is String) {
    println(obj.length)
  }

  if (obj !is String) {
    // 与 !(obj is String) 相同
    print("Not a String")
  } else {
    println(obj.length)
  }

  println(" `||` 右侧的 x 自动转换为字符串")
  if (obj !is String || obj.isEmpty()) {
    println("Not a String")
  } else {
    println(obj)
  }

  println(" `&&` 右侧的 x 自动转换为字符串")
  if (obj is String && obj.isNotEmpty()) {
    println(obj)
  }

  println("与when 表达是一起用")
  when (obj) {
    is Int -> print(obj + 1)
    is String -> println(obj.length)
    is IntArray -> println(obj.sum())
  }
}