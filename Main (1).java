class Main {
   static void impPrime(){
    System.out.println("Só imprime isso");
  }
  
  static void meuMetodo(String nome) {
    System.out.println("O nome é: " + nome);
  }


    static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "+ano + " anos");
  }

    
  public static void main (String[] args){

  impPrime();
  
  meuMetodo("Julia");
  meuMetodo("Deivid");
  meuMetodo("Isabella");

  nomeEidade("Julia", 17);
  nomeEidade("Deivid", 17);
  nomeEidade("Isabella", 20);

                           
  
}




  
}