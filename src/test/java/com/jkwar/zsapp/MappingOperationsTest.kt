package com.jkwar.zsapp

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 映射操作符
 */
class MappingOperationsTest {
  val list = listOf(1, 3, 5, 7)
  val listWithNull = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


  //遍历所有的元素，为每一个创建一个集合，最后把所有的集合放在一个集合中。
  @Test
  fun flatMapTest() {
    assertEquals(listOf(1, 3, 3, 9, 5, 15, 7, 21), list.flatMap {
      listOf(it, it * 3)
    })
  }

  //返回一个根据给定函数分组后的map
  @Test
  fun groupByTest() {
    assertEquals(mapOf("add" to listOf(1, 3, 5, 7, 9), "even" to listOf(2, 4, 6, 8, 10)), listWithNull.groupBy {
      if (it % 2 == 0) "even" else "odd"
    })
  }

  //返回一个每一个元素根据给定的函数转换所组成的List。
  @Test
  fun mapTest() {
    assertEquals(listOf(2, 6, 10, 14), list.map { it * 2 })
  }

  //返回一个每一个元素根据给定的包含元素index的函数转换所组成的List
  @Test
  fun mapIndexed() {
    assertEquals(listOf(0, 3, 10, 21), list.mapIndexed { index, i -> index * i })
  }

  //返回一个每一个非null元素根据给定的函数转换所组成的List
  @Test
  fun mapNotNullTest() {
    assertEquals(listOf(2, 4, 6, 8), listWithNull.mapNotNull { it * 2 })
  }


}