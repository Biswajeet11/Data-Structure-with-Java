
public class PalindRecur {
	
	public boolean isBoolean(String input) {
		if(input.length()<=1) {
			return true;
		}
		if(input.charAt(0)==input.charAt(input.length()-1)) {
				return isBoolean(input.substring(1,input.length()-1 ));
			}
		else {
			return false;
			}
	}
	
	public static void main(String []args) {
		PalindRecur p=new PalindRecur();
		p.isBoolean("racecar");
		
	}

}
