package Bill;

import java.util.Locale;
import java.util.Scanner;

import develop.init;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		init init = new init();

		System.out.printf("Sexo:");
		init.gender = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas:");
		init.beer = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes:");
		init.softDrink = sc.nextInt();
		System.out.printf("Quantidade de espetinhos:");
		init.barbecue = sc.nextInt();
		
		System.out.printf("\n");
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", init.feeding());
		System.out.printf("Couvert = R$ %.2f%n", init.cover());
		System.out.printf("Ingresso = R$ %.2f%n", init.tickt());
		
		System.out.printf("\n");
		System.out.printf("Valor a pagar = R$ %.2f",init.total());

		sc.close();

	}

}
