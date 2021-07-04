public class IsAlpha {
  public String solve(String A) {
    String str = A + A + "";

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = A.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        sb.append("#");
      } else if (Character.isUpperCase(ch)) {
        continue;
      } else {
        sb.append(ch);
      }
    }
    String singleString = sb.toString();
    return singleString;
  }

  public static void main(String args[]) {
    IsAlpha alpha = new IsAlpha();
    String a = "AbcaZeoB";
    String value = alpha.solve(a);
    System.out.println("Value" + value);
  }
}
