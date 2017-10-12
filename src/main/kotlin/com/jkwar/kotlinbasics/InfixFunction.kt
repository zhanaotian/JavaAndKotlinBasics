package com.jkwar.kotlinbasics

/**
 * 中缀函数
 */
fun main(args: Array<String>) {
  val a = 1
  val b = 2

  println("--中缀函数 shl --")
  println(a shl b)
  println("--中缀函数 shr --")

  println(a shr b)
  println("--中缀函数 ushr --")

  println(a ushr b)
  println("--中缀函数 and --")

  println(a and b)
  println("--中缀函数 or --")

  println(a or b)
  println("--中缀函数 xor --")

  println(a xor b)
  println("--中缀函数 inv --")

  println(b.inv())
}