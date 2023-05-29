fun main() {
print("Qual sua idade?")
  var idade = readLine()!!
  println ("Sua idade é: " + idade)
  //numeros digitados no teclado sao interpretados como texto
  //String
  //convertendo string para Int
  val num = idade.toInt()

  if (num >= 18) {
    println("Você é maior de idade")
  }else{
    println("Você é menor de idade")
  }
  
}