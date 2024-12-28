package app;

public class SalaryService {
	
	
	//FORMA ERRADA
	TaxService taxService = new TaxService();
	PensionTax pensiontax = new PensionTax();
	
	
	
	public double netSalary (Employee employee) {
		return employee.getGrossSalary() - taxService.Tax(employee.getGrossSalary()) - pensiontax.discont(employee.getGrossSalary());
 	}

}
