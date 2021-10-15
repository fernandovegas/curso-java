import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// exercicio 1

		/*
		 * double raio; double area;
		 * 
		 * raio = scn.nextDouble();
		 * 
		 * area = 3.14 *(Math.pow(raio, 2.0));
		 * 
		 * System.out.println("o valor é"+area);
		 */

		// exercicio 02

		/*
		 * int a, b, c, d, dif;
		 * 
		 * a = scn.nextInt(); b = scn.nextInt(); c = scn.nextInt(); d = scn.nextInt();
		 * 
		 * dif = (a*b)-(c*d);
		 * 
		 * System.out.println("a diferença é: "+dif);
		 */

		// exercicio 03

		/*
		 * int emNum,hours; double vh, salary; emNum = scn.nextInt(); hours =
		 * scn.nextInt(); vh = scn.nextDouble();
		 * 
		 * salary = vh*hours;
		 * 
		 * System.out.println("Funcionário número = " + emNum);
		 * System.out.println("Sálário: "+ salary);
		 */

		// exercicio 04

		/*
		 * int pc1, pc2, qt1, qt2; double vl1, vl2, total;
		 * 
		 * pc1 = scn.nextInt(); qt1 = scn.nextInt(); vl1 = scn.nextDouble();
		 * 
		 * pc2 = scn.nextInt(); qt2 = scn.nextInt(); vl2 = scn.nextDouble();
		 * 
		 * total = qt1*vl1 + qt2 *vl2;
		 * 
		 * System.out.println("Valor a Pagar: R$"+total);
		 */

		// Exercicio 05

		/*
		 * double a, b, c, tri, cir, trap, quad, ret, pi=3.14159;
		 * 
		 * a = scn.nextDouble(); b = scn.nextDouble(); c = scn.nextDouble();
		 * 
		 * tri = (a*c)/2; cir = Math.pow(c, 2.0)*pi; trap = (a+b)*c/2; quad =
		 * Math.pow(b, 2.0); ret = a*b;
		 * 
		 * System.out.printf("TRIANGULO: %.3f%n", tri);
		 * System.out.printf("CIRCULO: %.3f%n", cir);
		 * System.out.printf("TRAPEZIO: %.3f%n", trap);
		 * System.out.printf("QUADRADO: %.3f%n", quad);
		 * System.out.printf("RETANGULO: %.3f%n", ret);
		 */

		// Exercicios condições

		/*
		 * int num;
		 * 
		 * num = scn.nextInt();
		 * 
		 * if(num %2 == 0) { System.out.println("Par"); } else {
		 * System.out.println("Impar"); }
		 */

		// exer 03

		/*
		 * int A, B;
		 * 
		 * A = scn.nextInt(); B = scn.nextInt();
		 * 
		 * 
		 * if (A % B == 0 || B % A == 0) { 
		 * System.out.println("Sao Multiplos"); } 
		 * else {
		 * System.out.println("Nao sao Multiplos"); }
		 */

		// exer 04

		/*
		 * int hr_ini,hr_fim,horas;
		 * 
		 * hr_ini = scn.nextInt(); hr_fim = scn.nextInt();
		 * 
		 * if(hr_ini > hr_fim) { horas = 24 -(hr_ini-hr_fim);
		 * System.out.println("o jogo durou " +horas+ " horas"); } else if (hr_ini <
		 * hr_fim) { horas = -(hr_ini-hr_fim); System.out.println("o jogo durou "
		 * +horas+ " horas"); } else if (hr_ini == hr_fim) {
		 * System.out.println("o jogo durou 24 horas"); }
		 */

		int cod;
		int qtd;
		double preco=0;

		cod = scn.nextInt();
		qtd = scn.nextInt();
		
		if(cod==1) {
			preco =qtd*4.00;
		}
		else if (cod==2) {
			preco=qtd*4.5;
		}
		else if (cod==3) {
			preco=qtd*5.00;
		}
		else if(cod==4) {
			preco=qtd*2.00;
		}
		else if(cod==5) {
			preco=qtd*1.5;
		}
		System.out.printf("Total: R$ %.2f%n ", preco);
		scn.close();

	}

}
