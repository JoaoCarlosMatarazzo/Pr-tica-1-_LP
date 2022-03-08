package lp1;
import java.util.Scanner;
public class exercicio2
{
	public static void main(String[] args)
		{
		Scanner entrada = new Scanner(System.in);
		int ano;
		System.out.println("Por favor, informe o ano de fabricação do veiculo:");
		ano= entrada.nextInt();
		
			if(ano<=2010) 
			{  
			System.out.println("Este veiculo está classificado como: Carro Velho.");
			}
			else if(ano >= 2011 && ano <= 2021) 
			{
			System.out.println("Este veiculo está classificado como: Carro Semi Novo.");
			}
			else 
			{
			 System.out.println("Este veiculo está classificado como: Carro Novo.");
			}
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a placa: ");
		String placa = ler.nextLine();
	 
		System.out.println(placa.replaceAll("[AEIOUaeiou]", "*"));
		}
}