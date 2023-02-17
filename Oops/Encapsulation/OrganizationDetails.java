package Oops.Encapsulation;

public class OrganizationDetails {
	
	public static void main(String[] args) {
		
		
		Organization o = new Organization();
		o.setBranchCode(56500);
		o.setOrganizationName("ISRO");
		o.setBranchArea("Sriharikota");
		
		
		System.out.println(o.getBranchCode());
		System.out.println(o.getOrganizationName());
		System.out.println(o.getBranchArea());
	}

}
