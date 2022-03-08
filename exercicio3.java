package lp1;
import java.util.Scanner;
	public class exercicio3 
	{
		private static int vog;
		private static int cons;

		public exercicio3()
			{
			exercicio3.vog = 0;
			exercicio3.cons = 0;
			}

		public static void main(String[] args)
		{

		Scanner scan = new Scanner (System.in);

		System.out.println("Digite sua frase:");

		String frase = scan.nextLine();

		System.out.println("Sua frase é: " + frase);

		frase = frase.toLowerCase();
		exercicio3 cl = new exercicio3 ();
		int vogal = 0, consoante = 0;
		for(int i = 0; i < frase.length(); i++)
			{
		    char c = frase.charAt(i);
		    
		    if(c == 97 || c == 101 || c == 105 || c == 111 || c == 117)
		    	{
		    	vogal++;
		    	}
		    else
		    	{
		    	consoante++;
		    	}
			}
		cl.setVog(vogal);	
		cl.setCons(consoante);
		System.out.println("Na frase " +frase+ " temos:\n Vogais: " + cl.getVog() +  "\n Consoantes:" + cl.getCons());
		}

		public int getVog()
			{
			return vog;
			}
		public void setVog(int vog)
			{
			exercicio3.vog = vog;
			}
		public int getCons()
			{
			return cons;
			}
		public void setCons(int cons) 
			{
			exercicio3.cons = cons;
			}
	}