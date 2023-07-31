
fun main() {
  println("Digite dois numeros inteiros:")
  var num1 = readLine()!!.toInt()
  var num2 = readLine()!!.toInt()

  println()

  var calculadora =  Calculadora(num1, num2)
  println("Soma: " + calculadora.soma())
  println("Subtraçao: " + calculadora.subtraçao())
  println("Multiplicaçao: " + calculadora.multiplicaçao())
  println("divisao: " + calculadora.divisao())
}


class Calculadora(num1: Int,  num2: Int){
  var num1: Int = num1
  var num2: Int = num2





  fun soma(): Int{
    return num1 + num2
  }
  fun subtraçao(): Int{
    return num1 - num2

  }

  fun multiplicaçao(): Int{
    return num1 * num2

  }
  fun divisao(): Int{
    return num1 / num2

  }
}