package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		// cadastro dos novos empregados
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<employee> lista = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			
			System.out.println("ID: ");
			int id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			employee empregado = new employee(id, name, salary);
			lista.add(empregado);
		}
		
		//aumento para o funcionario
		
		System.out.println();
		System.out.print("Enter the id of the employee that will have an increase: ");
		int id = sc.nextInt();
		
		employee emp = lista.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double quantia = sc.nextDouble();
			emp.aumento(quantia);
		}
		
		//imprimindo lista atualizada
		
		System.out.println("List of employees");
		for(employee emplo: lista) {
			System.out.println(emplo.toString());
		}
		
		
		
		
		
		
		

	}

}
