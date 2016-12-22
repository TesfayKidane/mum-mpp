package mum.mpp.fetena.problem02;
import java.time.LocalDate;
import java.util.*;
public class TechnicalLead extends Employee implements HelperInterface{
	private List<Project> projects;
	public TechnicalLead(String name, double salary, LocalDate hireDate, List<Project> projects) {
		super(name, salary, hireDate);
		this.projects = projects;
	}
	
	public double getSalary() {
		return getSalary() + computeBonus(this.getHireDate());
	}
}
