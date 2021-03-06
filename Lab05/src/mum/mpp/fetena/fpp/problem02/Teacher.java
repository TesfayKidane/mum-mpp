package mum.mpp.fetena.fpp.problem02;

public final class Teacher implements EmployeeData {
	private final double bonus;
	private final String name;
	private final double salary;
	public Teacher(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
        @Override
	public double getSalary() {
		return salary + bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public String getName() {
		return name;
	}
}
