package com.jkwar.kotlinbasics

import java.util.*

//创建一个不可变的set
val mixedTypesSet = setOf(2, 2.22, "wo", "you", "it",null)

//创建一个为int类型的set
val intSet: Set<Int> = setOf(1, 2, 3, 4)

//创建一个可变的hashset  会把null 排序到第一位，线程不同步
val intsHashSet = hashSetOf(1,3,5,7,9,null)

//创建一个可变的自然排序的set 线程不同步
val intsSortedSet:TreeSet<Int> = sortedSetOf(10,4,1,3,6,7)

//创建一个可变的按照插入的顺序维护集合中的条目的链接set
val intsLinkedHashSet:LinkedHashSet<Int> = linkedSetOf(5,2,4,2)

//创建一个
val intsMutableSet:MutableSet<Int> = mutableSetOf(3,10,6,8)

fun main(args: Array<String>) {
  for (any in mixedTypesSet) {
    print(any)
  }
  println()
  for (hash in intsHashSet) {
    print(hash)
  }
  println()
  for (i in intsSortedSet) {
    print(i)
  }
  println()
  for (il in intsLinkedHashSet) {
    print(il)
  }

  println()
  println("--添加元素--")
  intsHashSet.add(2)
  println(intsHashSet)
  println("--删除元素--")
  intsHashSet.remove(2)
  println(intsHashSet)
  println("--判断是否包含某个元素--")
  intsHashSet.contains(1)
  println(intsHashSet)

  println("--清空--")
  intsMutableSet.clear()
  println(intsMutableSet)
}