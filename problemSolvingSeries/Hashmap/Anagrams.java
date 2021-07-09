import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*

Anagrams

Given an array A of N strings, return all groups of strings that are anagrams.

Represent a group by a list of integers representing the index(1-based)
in the original list. Look at the sample case for clarification.

Input:

 A = [cat, dog, god, tca]


Output:

 [ [1, 4],
   [2, 3] ] 
*/

public class Anagrams {
  public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    HashMap<String, ArrayList<Integer>> map = new HashMap<>();

    for (int i = 0; i < A.size(); i++) {

      String word = A.get(i);
      char letters[] = word.toCharArray();
      Arrays.sort(letters);
      String s = new String(letters);

      if (map.containsKey(s)) {
        ArrayList<Integer> list1;
        list1 = map.get(s);
        list1.add(i + 1);

        map.put(s, list1);
      }

      else {
        ArrayList<Integer> listOfIndexes = new ArrayList<>();
        listOfIndexes.add(i + 1);
        map.put(s, listOfIndexes);
      }
    }

    for (String s : map.keySet()) {
      ArrayList<Integer> values = map.get(s);
      list.add(values);
    }
    return list;
  }

  public static void main(String[] args) {
    Anagrams an = new Anagrams();
    List<String> list = new ArrayList<>();
    list.add("cat");
    list.add("dog");
    list.add("god");
    list.add("tca");

    ArrayList<ArrayList<Integer>> al =an.anagrams(list);
    
    for (int i = 0; i < al.size(); i++) {
      for (int j = 0; j < al.get(i).size(); j++) {
          System.out.print(al.get(i).get(j) + " ");
      }
      System.out.println();
  }
}





  }

}
