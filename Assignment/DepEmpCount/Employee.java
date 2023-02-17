package Assignment.DepEmpCount;

public class Employee {
	String empId;

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
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
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

	@Override
	public String toString() {
	//	return "Employee [empId=" + empId + "]";
		return empId;
	}
}
