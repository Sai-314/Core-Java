package Assignments.Maps;

public class Employee {

	int panNo =456;
	int ppfNo=85555;
	public Employee(int panNo, int ppfNo) {
		super();
		this.panNo = panNo;
		this.ppfNo = ppfNo;
	}
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	public int getPpfNo() {
		return ppfNo;
	}
	public void setPpfNo(int ppfNo) {
		this.ppfNo = ppfNo;
	}
	@Override
	public String toString() {
		return "Employee [panNo=" + panNo + ", ppfNo=" + ppfNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + panNo;
		result = prime * result + ppfNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (panNo != other.panNo)
			return false;
		if (ppfNo != other.ppfNo)
			return false;
		return true;
	}
	
}
