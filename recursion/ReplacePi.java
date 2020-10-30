
public class ReplacePi {

	public String replace(String input) {
		if(input.length()<=1) {
			return input;
		}
		
		if(input.charAt(0)=='p' && input.charAt(1)=='i') {
			return "3.14"+replace(input.substring(1));
		}
		else {
			return input.charAt(0)+replace(input.substring(1));
			
		}
	}
	
	public static void main(String[] args) {	
		ReplacePi p=new  ReplacePi();
		String s= p.replace("xpixpixxx");
		System.out.println(s);
	}
}
