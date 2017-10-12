package com.jkwar.kotlinbasics


/**
 * 索引操作符
 */
fun main(args: Array<String>) {
  //一维数组
  println("--索引操作符--")
  println(args[0])
  println(args[0] == "1")

  //二维数组
  println("--二维数组--")
  val array2d = Array(3, { Array(3) { it -> 3 } })
  println(array2d[0][2])
  println(array2d[0][2]==3)

  //三维数组
  println("--三维数组--")
  val array3d = Array(3){Array(3){IntArray(3)}}
  println(array3d[2][2][1])
  println(array3d[2][2][1]==0)
}