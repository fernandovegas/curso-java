package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Employee;

public class Listas {

	public static void main(String[] args) {

		/*List<String> list = new ArrayList<>();

		list.add("maria");
		list.add("João");
		list.add("marta");
		list.add("marilia");
		list.add("Cintia");
		list.add(3, "Fernando");
		list.remove("maria");
		
		//list.removeIf(x -> x.charAt(0) == 'm');
		
		
		for(String x :list) {
			System.out.println(x)
			};*/
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Employee #"+(i+1));
			System.out.println(" Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));

		}
		
		System.out.println("Enter the employee id that salary will be increased: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp ==null) {
			System.out.println("This id doesn´t exists!");
		
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
		
		

	}

}
