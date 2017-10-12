package com.jkwar.kotlinbasics


//创建一个不可变的int类型列表
var numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)

//创建一个不可变的string类型列表
var names: List<String> = listOf("jkwar", "android", "java", "c++")

//创建一个不可变的混合类型列表
var listMixedTypes = listOf(1, 2, 3, null, "123")

//创建一个空的不可变列表
val emptyList: List<String> = emptyList<String>()

//创建一个新的不可变列表，其中仅包含不为null的元素
var nonNullsList: List<Int> = listOfNotNull(1, null, 3, 5, 7)

//创建一个可变列表
var stringList: ArrayList<String> = arrayListOf<String>("java", "android", "c++")

//创建一个混合类型的可变列表
var mutableListNames = mutableListOf("you", "my", "it", 1, 2)

fun main(args: Array<String>) {
  println("--打印集合--")
  for (number in numbers) {
    println(number)
  }
  for (name in names) {
    println(name)
  }
  for (listMixedType in listMixedTypes) {
    println(listMixedType)
  }
  for (i in nonNullsList) {
    println(i)
  }
  println("--打印集合数量--")
  println(names.size)
  println(numbers.size)
  println("--判断是否为空--")
  println(names.isEmpty())
  println("--判断参数是否存在于集合中--")
  println(numbers.contains(10))
  println("--判断参数集合是否存在于集合中--")
  println(names.containsAll(listOf("jkwar", "android")))
  println("--返回指定索引处的元素的函数运算符--")
  println(names[0])
  println("--返回在列表中作为参数传递的元素的最后一次出现的索引，如果没有找到则返回-1--")
  println(names.indexOf("java"))
  println("--返回在列表中作为参数传递的元素的最后一次出现的索引，如果没有找到则返回-1--")
  println(names.indexOf("c++"))
  println(numbers.indexOf(0))
  println("--返回列表迭代器--")
  println(names.listIterator().next())
  println("--从指定位置开始,返回列表迭代器--")
  println(numbers.listIterator(3).next())
  println("--返回迭代器的元素集合--")
  println(numbers.asIterable())
  println("--返回一个列表，其中包含指定的起始和结束索引之间的列表部分--")
  println(names.subList(0, 4))
  println(numbers.subList(0, 2))

  println("---可变list---")
  println("--调用toMutableList()列表中的函数将不可变列表转换为可变列表--")
  val mutableNames = names.toMutableList()
  println("--添加元素--")
  mutableNames.add(0, "c##")
  println(mutableNames)
  println("--删除元素 c##,坐标为1的元素--")
  mutableNames.removeAt(1)
  mutableNames.remove("c##")
  println(mutableNames)
  println("--添加元素集合--")
  mutableNames.addAll(0, listOf("汇编语言", "ruby"))
  println(mutableNames)
  println("--删除元素集合--")
  mutableNames.removeAll(listOf("java", "ruby"))
  println(mutableNames)
  println("--仅保留作为参数传递的集合中存在的元素--")
  mutableNames.retainAll(listOf("java", "c++"))
  println(mutableNames)
  println("--元素替换--")
  mutableListNames.set(0, "c")
  println(mutableListNames)
}