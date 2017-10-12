package com.jkwar.kotlinbasics

/**
 * 重载算术操作符
 */
data class Complex(var real: Double, val imaginary: Double) {
  operator fun plus(other: Complex): Complex {
    return Complex(real + other.real, imaginary + other.imaginary)
  }

  //a+b
  operator fun plus(other: Any): Int {
    return real.toInt()
  }

  //a-b
  operator fun minus(other: Complex): Complex {
    return Complex(real - other.real, imaginary - other.imaginary)
  }

  //a*b
  operator fun times(other: Complex): Complex {
    return Complex(real * other.real, imaginary * other.imaginary)
  }

  //a/b
  operator fun div(other: Complex): Complex {
    return Complex(real / other.real, imaginary / other.imaginary)
  }

  //a%b
  operator fun rem(other: Complex): Complex {
    return Complex(real % other.real, imaginary % other.imaginary)
  }

  operator fun rangeTo(other: Complex): Complex {
    return Complex(real + other.imaginary, imaginary + other.real)
  }

  //()
  operator fun invoke(): Double {
    return Math.hypot(real, imaginary)
  }

  override fun toString(): String {
    return "$real + ${imaginary}i"
  }
}

data class Point(var x: Int, var y: Int) {
  // -a
  operator fun unaryMinus(): Point {
    return Point(-x, y)
  }

  // +a
  operator fun unaryPlus(): Point {
    return Point(x, -y)
  }

  // !a
  operator fun not(): Boolean {
    return x == y
  }

  // a++
  operator fun inc(): Point {
    return Point(x + y, x + y)
  }

  // a--
  operator fun dec(): Point {
    return Point(x - y, y - x)
  }

  override fun toString(): String {
    return "$x + $y"
  }
}

fun main(args: Array<String>) {
  println("--一元操作符--")
  println("--重载 -a --")
  var point = Point(10, 20)
  println(-point)

  println("--重载 +a --")
  println(+point)

  println("--重载 !a --")
  println(!Point(10, 10))

  println("--重载 a++ --")
  point++
  println(point)

  println("--重载 a-- --")
  point--
  println(point)

  println("--二元操作符--")
  val a: Int = 3
  val b: Int = 4
  println("--重载 a+b 运算--")
  val c1 = Complex(3.0, 4.0)
  val c2 = Complex(4.0, 5.0)
  println(c1 + c2)
  println(c1 + 5)
  println(c1())
  println("--重载 a-b 运算--")
  println(c2 - c1)
  println("--重载 a*b 运算--")
  println(c2 * c1)
  println("--重载 a/b 运算--")
  println(c2 / c1)
  println("--重载 a%b 运算--")
  println(c2 % c1)
  println("--重载 a..b 运算--")
  println(c2..c1)
}