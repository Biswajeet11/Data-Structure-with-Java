
import java.util.Scanner;

public class SumArray {
	
	public  int sum(int input[],int startIndex) {
		if(input.length==startIndex) {
			return 0;
		}
		return input[startIndex]+sum(input, startIndex+1);
	}
	
	public int sum(int input[]) {
		return sum(input,0);
	}

	public static void main(String[] args) {
		SumArray s=new SumArray();
	//	Scanner sc =new Scanner(System.in);
		int[] input= {1,2,4};
	int st=	s.sum(input);
		System.out.println(st);

	}

}

