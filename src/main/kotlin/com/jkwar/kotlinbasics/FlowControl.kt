package com.jkwar.kotlinbasics

/**
 * 流程控制
 */

fun main(args: Array<String>) {
  //if
  val a = 1
  val b = 4
  val c = "string"
  val stringlist = listOf(1, 2, 3, "java", 'c')
  val validNumbers = 1..5
  println("-- if 表达式--")
  val max = if (a > b) {
    print("Choose a")
    a
  } else {
    print("Choose b")
    b
  }
  println()
  println(max)

  println("--When 表达式--")
  when (a) {
    0 -> println(0)
    1 -> println(1)
    else -> {
      println("a not is 0 or 1")
    }
  }

  when (a) {
    0 -> println("a is 1 or 2")
    else -> println("a not is 0 nor 1")
  }

  when (b) {
    in 1..10 -> println("b is in the range")
    in validNumbers -> print("b is valid")
    !in 10..20 -> print("b is outside the range")
    else -> print("none of the above")
  }

  fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
  }

  println(hasPrefix("yes"))

  println("--For 循环--")
  for (item in stringlist) println(item)

  for (i in stringlist.indices) {
    println(stringlist[i])
  }

  for ((index, value) in stringlist.withIndex()) {
    println("the element at $index is $value")
  }

  println("--While 循环--")
  var d = 8
  while (d < 10) {
    println(d)
    d++
  }

  println("--do While 循环--")
  var y = 10
  do {
    y++
    println(y)
  } while (y < 15)

  println("-- break 语句 --")
  breaks@ for (arg in args) {
    if (arg == "Java") {
      break@breaks
    }
    println(arg)
  }
  println("-- continue 语句 --")
  continues@ for (arg in args) {
    if (arg == "Java") {
      continue@continues
    }
    println(arg)
  }
  println("-- return 语句 --")
  returns@ for (arg in args) {
    if (arg == "Java") {
      return@returns
    }
    println(arg)
  }
}