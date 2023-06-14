 fun main(args: Array<String>) {
  println("Qual seu nome?")
  val texto=readLine()!!
  println("Seja bem vindo: " + texto)

  println("Digite um numero inteiro: ")
  var num1=readLine ()!!
    var x = num1.toInt()
  println("Digite outro numero inteiro: ")
  var num2= readLine ()!!
    var y = num2.toInt()
  var soma=x+y
  var sub=x-y 
  var mult=x*y
  var div=x/y
  var rest=x%y
  println("O resultado da Soma é: " +soma)
  println("O resultado da Subtração é: " +sub)
  println("O resultado da Multiplicação é: " +mult)
  println("O resultado da Divisão é: " +div)
  println("O resto da divisão é: " +rest)
 }