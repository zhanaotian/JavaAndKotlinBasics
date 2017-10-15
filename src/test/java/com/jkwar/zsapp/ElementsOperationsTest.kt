package com.jkwar.zsapp

import org.junit.Assert.*
import org.junit.Test


/**
 * 元素操作符
 */
class ElementsOperationsTest {
  val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


  //如果指定集合可以在集合中找到，返回true
  @Test
  fun containsTest() {
    assertTrue(list.contains(3))
  }

  //返回给定index对应的元素，如果index数据越界抛出异常
  @Test
  fun elementAtTest() {
    assertEquals(6, list.elementAt(5))
  }

  //返回给定indexd对应的元素，如果数据越界则根据指定的函数返回默认值
  @Test
  fun elementAtOrElseTest() {
    assertEquals(100, list.elementAtOrElse(10, { it * 10 }))
  }

  //返回给定index对应的元素，如果index越界则返回null
  @Test
  fun elementAtOrNullTest() {
    assertNull(list.elementAtOrNull(10))
  }

  //返回符合给定函数条件的第一个元素
  @Test
  fun firstTest() {
    assertEquals(5, list.first { it % 5 == 0 })
  }

  //返回符合给定函数条件的第一个元素，如果没有符合返回null
  @Test
  fun firstOrNull() {
    assertNull(list.firstOrNull { it % 11 == 0 })
  }

  //返回指定元素的第一个index，如果不存在，则返回-1
  @Test
  fun indexOfTest() {
    assertEquals(9, list.indexOf(10))
  }

  //返回第一个符合给定函数条件的元素的index，如果不存在，则返回 -1
  @Test
  fun indexOfFirstTest() {
    assertEquals(8, list.indexOfFirst { it % 9 == 0 })
  }

  //返回最后一个符合给定函数条件的元素的index，如果不存在，则返回 -1
  @Test
  fun indexOfLastTest() {
    assertEquals(9, list.indexOfLast { it % 10 == 0 })
  }

  //返回符合给定函数条件的的最后一个元素
  @Test
  fun lastTest() {
    assertEquals(9, list.last { it % 9 == 0 })
  }

  //返回符合给定函数条件的的最后一个元素，如果没有则返回null
  @Test
  fun lastOrNullTest() {
    assertEquals(10, list.lastOrNull { it % 10 == 0 })
  }

  //返回符合函数条件的单个元素，如果没有符合或者超过一个，则抛出异常
  @Test
  fun singleTest() {
    assertEquals(9, list.single { it % 9 == 0 })
  }

  //返回符合函数条件的单个元素，如果没有符合或者超过一个，则返回null
  @Test
  fun singleOrNullTest() {
    assertNull(list.singleOrNull { it % 17 == 0 })
  }

}