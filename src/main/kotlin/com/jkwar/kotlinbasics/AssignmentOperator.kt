package com.jkwar.kotlinbasics

/**
 * 赋值操作符
 *
 */

data class Points(var x: Int, var y: Int) {
  // a+=b
  operator fun plusAssign(points: Points) {
    this.x = this.x + points.x
    this.y = this.y + points.y
  }

  // a-=b
  operator fun minusAssign(points: Points) {
    this.x = this.x - points.x
    this.y = this.y - points.y
  }

  // a*=b
  operator fun timesAssign(points: Points) {
    this.x = this.x * points.x
    this.y = this.y * points.y
  }

  // a/=b
  operator fun divAssign(points: Points) {
    this.x = this.x / points.x
    this.y = this.y / points.y
  }

  // a%=b
  operator fun remAssign(points: Points) {
    this.x = this.x % points.x
    this.y = this.y % points.y
  }


}

fun main(args: Array<String>) {
  val points = Points(3, 4)
  val points1 = Points(5, 6)
  points += points1
  println("--操作符 +=--")
  println(points)
  points -= points1
  println("--操作符 -=--")
  println(points)
  points *= points1
  println("--操作符 *=--")
  println(points)
  points /= points1
  println("--操作符 /=--")
  println(points)
  points %= points1
  println("--操作符 %=--")
  println(points)
}