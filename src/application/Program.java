package application;

import java.util.Scanner;

import services.PrintService;



public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		//aceita inserir string problema de segurança
		//ps.addValue("Maria") por exemplo
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		//nao pode integer para object
		
		ps.print();
		System.out.println("First: " + ps.first());

		sc.close();
	}
}
