package com.jkwar.kotlinbasics


/**
 * 集合操作
 */
val stringLists: List<String> = listOf("java", "c++", "c#")

val intSets: Set<Int> = setOf(3, 5, 6, 6, 6, 3)

fun main(args: Array<String>) {
  println("--返回最后一个元素--")
  println(stringLists.last())
  println(intSets.last())
  println("--返回第一个元素--")
  println(stringLists.first())
  println(intSets.first())
  println("--返回最大元素--")
  println(stringLists.max())
  println(intSets.max())
  println("--返回一个新的列表或集合,其中包含除前n个元素之外的所有元素--")
  println(stringLists.drop(1))
  println(intSets.drop(1))
  println(stringLists.dropLast(1))
  println("--返回一个新的包含原始元素的集合--")
  println(stringLists.plus("c"))
  println(intSets.plus(10))
  println("--返回一个新的包含原始集合除了给定元素的所有元素的集合--")
  println(stringLists.minus("java"))
  println(intSets.plus(3))
  println("--返回集合中平均数量的元素--")
  println(stringLists.asReversed())
  println(intSets.average())
}