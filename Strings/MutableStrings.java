package Strings;

public class MutableStrings {
	
	public static void main(String[] args) {
		
		String text = "Lord ";
		System.out.println(text);
		text = text+ "Krishna";
//		String s = "welcome";
//		String s1 = new String("welcome");
		
		System.out.println(text);

		
//		StringBuffer sb = new StringBuffer();
//		sb.append("Hello");
//		System.out.println(sb.capacity());
//		sb.append("1234567891234567891234567891234567");
//		System.out.println(sb.capacity());
//		sb.append("String");
//		System.out.println(sb.capacity());
		
		StringBuffer sb=new StringBuffer();    
        System.out.println(sb.capacity());//default 16    
        sb.append("Hello");    
        System.out.println(sb.capacity());//now 16    
        sb.append("java is my favourite language");    
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (old capacity*2)+2    
        sb.append("string");   
        System.out.println(sb.capacity());//now (34*2)+2=70  
        System.out.println(sb);
        sb.delete(0, 34);
        System.out.println(sb);
        
	}

}
