package com.jkwar.zsapp

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 过滤操作符
 */
class FilteringOperationsTest {
  private val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val listWithNull = listOf(1, 3, 5, null, 7, 9)

  //返回包含去掉前n个元素的所有元素的列表
  @Test
  fun dropTest() {
    assertEquals(listOf(5, 6, 7, 8, 9, 10), list.drop(4))
  }

  //返回根据给定函数从第一项开始去掉指定元素的列表
  @Test
  fun dropWhileTest() {
    assertEquals(listOf(5, 6, 7, 8, 9, 10), list.dropWhile { it < 5 })
  }


  //过滤所有符合给定函数条件的元素
  @Test
  fun filterTest() {
    assertEquals(listOf(2, 4, 6, 8, 10), list.filter { it % 2 == 0 })
  }

  //过滤所有不符合给定函数条件的元素
  @Test
  fun filterNotTest() {
    assertEquals(listOf(1, 3, 5, 7, 9), list.filterNot { it % 2 == 0 })
  }

  //过滤所有元素中不是null的元素
  @Test
  fun filterNotNullTest() {
    assertEquals(listOf(1, 3, 5, 7, 9), listWithNull.filterNotNull())
  }

  //过滤一个list中指定index的元素
  @Test
  fun sliceTest() {
    assertEquals(listOf(2, 3), list.slice(listOf(1, 2)))
    assertEquals(listOf(4, 5), list.slice(3..4))
  }

  //返回从第一个开始的n个元素
  @Test
  fun takeTest() {
    assertEquals(listOf(1, 2, 3), list.take(3))
  }

  //返回从最后一个开始的n个元素
  @Test
  fun takeLastTest() {
    assertEquals(listOf(8, 9, 10), list.takeLast(3))
  }

  //返回从第一个开始符合给定函数条件的元素
  @Test
  fun takeWhileTest() {
    assertEquals(listOf(1, 2, 3, 4), list.takeWhile { it < 5 })
  }

}