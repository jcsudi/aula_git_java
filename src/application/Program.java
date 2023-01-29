package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		
		if(bill.cover() == 0.00) {
			System.out.println("Insento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());		
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		
		System.out.println();
		System.out.printf("Valor a pagar = RS %.2f%n", bill.total());
		
		
		
		
		
		
		
		
		
		

	}

}
