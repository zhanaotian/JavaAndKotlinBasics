package com.jkwar.zsapp

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 生产操作符
 */
class GenerationOperationsTest {
  val list = listOf(1, 2, 3, 4, 5, 6)
  val listRepeated = listOf(2, 3, 4, 5, 6, 7)

  /**
   * 把一个给定的集合分割成两个，第一个集合是由原集合每一项元素匹配给定函数条件返回true的元素组成，
   * 第二个集合是由原集合每一项元素匹配给定函数条件返回false的元素组成
   */
  @Test
  fun partitionTest() {
    assertEquals(Pair(listOf(2, 4, 6), listOf(1, 3, 5)), list.partition { it % 2 == 0 })
  }

  //返回一个包含原集合和给定集合中所有元素的集合，因为函数名字的原因，我们可以使用+操作符
  @Test
  fun plusTest() {
    assertEquals(listOf(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7), list + listRepeated)
  }

  //返回由pair注册的list，每个pair由2个集合中相同的index的元素组成，这个返回 list的大小由最小的那个集合决定
  @Test
  fun zipTest() {
    assertEquals(listOf(Pair(1, 2), Pair(2, 3), Pair(3, 4), Pair(4, 5), Pair(5, 6), Pair(6, 7)), list.zip(listRepeated))
  }

  //从包含pair的List中生成包含List的Pair。
  @Test
  fun unzipTest() {
    assertEquals(Pair(listOf(5, 6), listOf(4, 8)), listOf(Pair(5, 4), Pair(6, 8)).unzip())
  }
}