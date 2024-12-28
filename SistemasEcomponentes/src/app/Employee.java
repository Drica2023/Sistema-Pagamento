package app;

public class Employee {

	private String nome;
	private double grossSalary;

	public Employee() {
	}

	public Employee(String nome, double grossSalary) {
		super();
		this.nome = nome;
		this.grossSalary = grossSalary;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	

}
