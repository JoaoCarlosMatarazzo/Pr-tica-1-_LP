package lp1;
import java.util.Scanner;
public class exercicio1
{
	public static void main(String[] args)
		{
		Scanner ler = new Scanner(System.in);
		double km, l, consumo, vm;
		int h;
		System.out.println("Por favor, apresente a distância percorrida em quilomentros e a litragem de combustivel consumida no decorrer do percurso para serem calculados:");

		km = ler.nextDouble();
		l = ler.nextDouble();
		consumo = (km/l);
		
		System.out.println("Por favor, agora apresente o tempo  gasto no decorrer de todo ao percurso:");
		
		h = ler.nextInt();
		vm = (km/h);
		

	System.out.printf("Ao final do percurso, o veiculo consumiu uma media de quilometro por litro de: %.2f\n", consumo);
	System.out.println("Ao final do percurso, o tempo percorrido pelo veiculo em horas foi de:\n" + h + " horas.");
	System.out.printf("A velocidade média do veiculo totalizou como: %.2f\n", vm ," km/h");
	}
}