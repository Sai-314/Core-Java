package Basic;

class Oops {
	public static void main(String args[]) {
		int percentage = 'b';
		char grade = 97;
		String name = "Sai";
		System.out.println(grade);
		System.out.println(percentage);
		System.out.println(name);

		Boolean Love = true;
        String firstLove = "Space";
		if (Love==true) {
			if(firstLove =="Space"){
			System.out.println("Space is luv");
			}
			else {
			System.out.println("Girl is luv");
			}
		} else {
			System.out.println("No luv");
		}
		overload m = new overload();
		m.mocktail(100,50);
		override n = new override();
		n.mocktail();
		inheritance o = new inheritance();
		o.mocktail();
	//	parent p = new parent();	
		children1 q = new children1();
		q.children();
		q.kid();
	}
}
//
