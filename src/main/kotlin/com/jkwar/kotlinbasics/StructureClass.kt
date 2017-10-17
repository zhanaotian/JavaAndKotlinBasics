package com.jkwar.kotlinbasics

/**
 * 构造函数与初始化语句
 */
class StructureClass constructor(val file: String = "") {
  init {
    println("Customer initialized with value ${file}")
  }

  constructor() : this("aa") {

  }

  private constructor(file: String, name: String) : this(file + name) {

  }

}

fun main(args: Array<String>) {
  StructureClass()
  StructureClass("asdasd")
}

