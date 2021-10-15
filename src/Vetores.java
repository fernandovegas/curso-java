import java.util.Locale;
import java.util.Scanner;

import Entities.Product;
import Entities.Student;

public class Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * int n = sc.nextInt(); double[] vect = new double[n]; for (int i=0; i<n; i++)
		 * { vect[i] = sc.nextDouble(); } double sum = 0.0; for (int i=0; i<n; i++) {
		 * sum += vect[i]; } double avg = sum / n;
		 * System.out.printf("AVERAGE HEIGHT: %.2f%n", avg); sc.close();
		 */

		/*
		 * int n = sc.nextInt(); Product[] vect = new Product[n];
		 * 
		 * for(int i=0; i<vect.length;i++) { sc.nextLine(); String name = sc.nextLine();
		 * double price = sc.nextDouble(); vect[i] = new Product(name,price); }
		 * 
		 * double sum=0; for(int i=0;i<vect.length;i++) { sum += vect[i].getPrice(); }
		 * double avg = sum/n;
		 * 
		 * System.out.println("Averege Price: " +avg);
		 */

		System.out.println("How many rooms will be rented? ");
		int x = sc.nextInt();

		Student[] vect = new Student[10];

		for (int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("Rent #"+(i+1));
			System.out.println(" Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int rom = sc.nextInt();
			vect[rom] = new Student(name, email, rom);

		}
		
		System.out.println("Busy Rooms");
		
		for(int i=0;i< vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}

	}
}
