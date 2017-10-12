package com.jkwar.kotlinbasics


/**
 * 比较操作符
 */

data class Big(val a: Int, val b: Int) {

  //a.compareTo(b) > 0
  //a.compareTo(b) < 0
  //a.compareTo(b) >= 0
  //a.compareTo(b) <= 0
  operator fun compareTo(other: Big): Int {
    return (this.a + this.b) - (other.a + other.b)
  }
}

fun main(args: Array<String>) {
  val a = Big(3, 5)
  val b = Big(4, 6)
  println("--比较操作符--")
  println("--a > b--")
  println(a > b)
  println("--a < b--")
  println(a < b)
  println("--a >= b--")
  println(a >= b)
  println("--a <= b--")
  println(a <= b)
}