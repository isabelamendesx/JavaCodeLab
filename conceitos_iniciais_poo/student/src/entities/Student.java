package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public String toString(){
		double total = grade1 + grade2 + grade3;
		if (total >= 60.00) {
			return "FINAL GRADE = "
			+ String.format("%.2f", total)
			+ String.format("%n")
			+ "PASS";
		} else {
			return "FINAL GRADE = "
			+ String.format("%.2f", total)
			+ String.format("%n")
			+ "FAILED"
			+ String.format("%n")
			+ "MISSING " + String.format("%.2f", (60 - total));
		}
	}
}
