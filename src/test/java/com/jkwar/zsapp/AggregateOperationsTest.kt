package com.jkwar.zsapp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * 总数操作符
 *
 * @param
 */
class AggregateOperationsTest {
  val list = listOf(1, 2, 3, 4, 5, 6)

  //如果至少有一个元素符合给出的判断条件,则返回true
  @Test
  fun anyTest() {
    assertTrue(list.any { it % 2 == 0 })
    assertFalse(list.any { it > 100 })
  }

  //如果全部的元素符合给出的条件，则返回true
  @Test
  fun allTest() {
    assertTrue(list.all { it < 100 })
    assertFalse(list.all { it > 50 })
  }

  //返回符合给出判断条件的元素总数
  @Test
  fun countTest() {
    assertEquals(4, list.count { it > 2 })
  }

  //在一个初始值的基础上从第一项到最后一项通过一个函数累计所有的元素
  @Test
  fun foldTest() {
    assertEquals(15, list.fold(4) { total, next -> total + next })
  }

  //与fold一样，但是顺序是从最后一项到第一项
  @Test
  fun foldRightTest() {
    assertEquals(25, list.foldRight(4) { total, next -> total + next })
  }

  //遍历所有元素，并执行给定的操作
  @Test
  fun forEachTest() {
    list.forEach {
      println(it)
    }
  }

  //与forEach，但是我们同时可以得到元素的index
  @Test
  fun forEachIndexedTest() {
    list.forEachIndexed { index, i ->
      println("position $index contains a $i")

    }
  }

  //返回最大的一项，如果没有则返回null
  @Test
  fun maxTest() {
    assertEquals(6, list.max())
  }

  //根据给定的函数返回最大的一项，如果没有则返回null。
  @Test
  fun maxByTest() {
    assertEquals(6, list.maxBy { it / 2 })
  }

  //返回最小的一项，如果没有则返回null
  @Test
  fun minTest() {
    assertEquals(1, list.min())
  }

  //根据给定的函数返回最小的一项，如果没有则返回null
  @Test
  fun minByTest() {
    assertEquals(6, list.minBy { -it })
  }

  //如果没有任何元素与给定的函数匹配，则返回true
  @Test
  fun noneTest() {
    assertTrue(list.none { it > 100 })
  }

  //与fold一样，但是没有一个初始值。通过一个函数从第一项到最后一项进行累计
  @Test
  fun reduceTest() {
    assertEquals(21, list.reduce { acc, i -> acc + i })
  }

  //与reduce一样，但是顺序是从最后一项到第一项
  @Test
  fun reduceRight() {
    assertEquals(21, list.reduceRight { acc, i -> acc + i })
  }


  //返回所有每一项通过函数转换之后的数据的总和
  @Test
  fun sumBy() {
    assertEquals(81, list.sumBy { it + 10 })
  }

}