/**
  * Created by altair on 02.05.16.
  */

/*
* Лабораторная работа №5.
* Вариант 2
* Задача 11
* */

object MainObj {
    def main(args: Array[String]): Unit = {
        val L = 50
        val M = 50
        val N = 50
        val n1 = N
        val tast = new SphericalCSTask(1, 7, L , M, N)
        val model = tast model()
        println("analitical")
        println(model(n1))
        val res = tast solve()
        println("numerical")
        println(res(n1))
        val delta = res(n1) delta model(n1)
        println("max delta=" + delta)
    }
}
