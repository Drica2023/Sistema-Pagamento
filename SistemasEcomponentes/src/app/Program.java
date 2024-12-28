package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Salary: ");
		double grossSalary = scanner.nextDouble();
		
		Employee employee = new Employee(nome, grossSalary);
		SalaryService salaryService = new SalaryService ();
		
		double netSalary = salaryService.netSalary(employee); 
		
		System.out.printf(nome + " Salary liquido = %.2f\n", netSalary);
		
		
		scanner.close();

	}

}
