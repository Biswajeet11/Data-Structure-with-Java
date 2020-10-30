
public class TowerOfHanoi {
	
	public static void tower(char s,char h,char d,int n) {
		if(n==1) {
			System.out.println("The source is " +s+" the helper is "+ h +" the destination is d");
			return;
		}
		tower(s,d,h,n-1);
		System.out.println("The source is " +s+" the helper is "+ h +" the destination is d");
		tower(h,s,d,n-1);
		
	}

	public static void main(String[] args) {
		tower('s', 'h', 'd', 3);
	}
}


