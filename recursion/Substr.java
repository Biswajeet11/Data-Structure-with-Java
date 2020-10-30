
public class Substr {
	public void substr(String input,String ans) {
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}
		substr(input.substring(1),ans);
		substr(input.substring(1), ans+input.charAt(0));
	}
	public void substr(String input) {
		substr(input,"");
	}
	public static void main(String[] args) {
		Substr s=new Substr();
		s.substr("xyz");
	}
}
