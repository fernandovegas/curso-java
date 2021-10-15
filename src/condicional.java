import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int hora;

		// hora = sc.nextInt();

		/*
		 * if (hora < 12) { System.out.println("bom dia"); } else if(hora < 18) {
		 * System.out.println("boa tarde"); } else if (hora > 18) {
		 * System.out.println("Boa noite"); }
		 */

		// switch case

		/*int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia= "quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia="sabado";
			break;
		default:
			dia = "valor invalido";
		}
		
		System.out.println("o dia da semana é " + dia);*/
		
		//operadores ternários
		
		double preco =34.5;
		double desconto;
		desconto = (preco< 20)? preco * 0.1 : preco * 0.5;
		 System.out.println(desconto);

		sc.close();

	}

}
