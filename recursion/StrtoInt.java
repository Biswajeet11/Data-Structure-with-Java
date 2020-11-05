
public class StrtoInt {

	public int cvtStrToiInt(String input) {
		if (input.length() == 1) {
			return input.charAt(0) - '0';
		}
		int smallAns = cvtStrToiInt(input.substring(input.length() - 1));
		int lastdigit = input.charAt(input.length() - 1) - '0';
		return smallAns * 10 + lastdigit;
	}

	public static void main(String[] args) {
		StrtoInt s = new StrtoInt();
		s.cvtStrToiInt("123");

	}

}
