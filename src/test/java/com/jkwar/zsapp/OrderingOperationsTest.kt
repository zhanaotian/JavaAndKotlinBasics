package com.jkwar.zsapp

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 排序操作符
 */
class OrderingOperationsTest {
  val list = listOf(1, 3, 5, 7, 9)


  //返回一个与指定list相反顺序的list
  @Test
  fun reverSeTest() {
    assertEquals(listOf(9, 7, 5, 3, 1), list.reversed())
  }

  val unsortlist = listOf(3, 1, 2, 6, 7, 6, 3, 2, 3)

  //返回一个自然排序后的list
  @Test
  fun sortTest() {
    assertEquals(listOf(1, 2, 3, 3, 3, 3, 6, 6, 7), unsortlist.sorted())
  }

  //返回一个根据指定函数排序后的list
  @Test
  fun sortByTest() {
    assertEquals(listOf(1, 2, 7, 2, 3, 6, 6, 3, 3), unsortlist.sortedBy { it % 3 == 0 })
  }

  //返回一个降序排序后的list
  @Test
  fun sortDescendingTest() {
    assertEquals(listOf(7, 6, 6, 3, 3, 3, 2, 2, 1), unsortlist.sortedDescending())
  }

  //返回一个根据指定函数降序排序后的list
  @Test
  fun sortDescendingBy() {
    assertEquals(listOf(1, 2, 2, 3, 3), unsortlist.sortedByDescending {
      it <= 3
    })
  }
}