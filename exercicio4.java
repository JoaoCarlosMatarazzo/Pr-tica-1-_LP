import java.util.Scanner;
class exercicio4 
{
  public static void main(String[] args) 
  {
    Scanner ler = new Scanner(System.in);
    int i = 0;
    do
    {
      System.out.prinln("1-Cadastrar Passageiro.");
      System.out.prinln("2-Check in.");
      System.out.prinln("3-Cancelar voo.");
      System.out.prinln("4-Sair.");
    
    switch()
      {
      case 1:
        System.out.println("Por favor, digite o seu nome:");
        nome=ler.next();
        System.out.println("Por favor, digite o seu CPF:");
        cpf=ler.next();
        System.out.println("Por favor, digite a data do voou:");
        data=ler.next();
        System.out.println("Por favor, digite a hora do voou:");
        hora=ler.next();
        System.out.println("Cadastro efetuado com sucesso.");
      break;
      case 2:
        System.out.println("Por favor, digite o seu CPF:");
        cpf=ler.next();
        System.out.println("Por favor, digite o número do voou:");
        num=ler.next();
      break;
      case 3:
        System.out.println("Por favor, digite o seu cpf:");
        cpf=ler.next();
        System.out.println("Por favor, digite o número do seu voou:");
        num=ler.next();
        System.out.println("Voou cancelado com sucesso.");
      break;
      }
    }while(i !=0);
  }
}