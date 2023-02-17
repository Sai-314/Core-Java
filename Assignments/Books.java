package Assignments;

public class Books {
	
	private int pageNo;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		if(pageNo >0) {
			System.out.println("The page number "+ pageNo+" is valid");
		}
		else {
			System.out.println("The page number "+ pageNo+" is Invalid");
		}
	
	}
}
