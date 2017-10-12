package com.jkwar.kotlinbasics

import java.util.*

//创建一个不可变的map
val callingCodesMap: Map<Int, String> = mapOf(234 to "Java", 567 to "kotlin", 890 to "c++")


//创建一个可变的map
val currenciesMutableMap: MutableMap<String, String> = mutableMapOf("Java" to "hello word java", "c" to "hello word c")

//创建一个可变的HashMap
val personsHashMap = hashMapOf(1 to "a", 2 to "b", 3 to "c", 4 to null)

//创建一个可变的以key升序的map
val personsSortedMap: SortedMap<Int, String> = sortedMapOf(1 to "见面", 0 to "再见")

//创建一个可变的并保持在它们被插入的顺序映射条目的链接map
val postalCodesHashMap: LinkedHashMap<String, String> = linkedMapOf("java" to "hello word java", "c++" to "hello word c++")

fun main(args: Array<String>) {
  for ((key, value) in callingCodesMap) {
    print("$key is the calling code for $value")
  }
  println()
  for ((key, value) in personsHashMap) {
    print("$key is the calling code for $value")
  }
  println()
  for ((key, value) in postalCodesHashMap) {
    print("$key is the calling code for $value")
  }
  println()
  for ((key, value) in personsSortedMap) {
    print("$key is the calling code for $value")
  }

  println()
  println(callingCodesMap[234])
  println("--map 大小--")
  println(callingCodesMap.size)
  println("--map 是否为空--")
  println(callingCodesMap.isEmpty())
  println("--map 是否包含某个元素,存在则返回true--")
  println(callingCodesMap.containsKey(234))
  println("--map 是否包含一个或多个值，存在则返回true--")
  println(callingCodesMap.containsValue("Java"))
  println("--返回与给定键匹配的值，如果没有找到则返回“null--")
  println(callingCodesMap.get(678))
  println("--添加键值对,这将返回与键相关联的上一个值，如果以前未使用该键，则返回null--")
  println(currenciesMutableMap.put("kotlin", "hello word kotlin"))
  println(currenciesMutableMap)
  println("--删除一个键值对--")
  println(currenciesMutableMap.remove("java"))
  println(currenciesMutableMap)
  println("--返回与给定键匹配的值，如果没有找到则返回“null”--")
  currenciesMutableMap.putAll(mapOf("python" to "hello word python"))
  println(currenciesMutableMap)
  println("--删除所有元素--")
  currenciesMutableMap.clear()
  println(currenciesMutableMap)
  println("--返回与给定键匹配的值，如果没有找到则返回“null”--")
  println(callingCodesMap.values)
}