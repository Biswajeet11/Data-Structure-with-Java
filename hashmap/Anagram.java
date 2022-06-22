import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
* Example Input
Input 1:

 A = [cat, dog, god, tca]
Input 2:

 A = [rat, tar, art]


Example Output
Output 1:

 [ [1, 4],
   [2, 3] ]
Output 2:

 [ [1, 2, 3] ]
 * */

class Anagram {

    public static ArrayList<ArrayList<Integer>> anagramArr(ArrayList<String> arr) {

        HashMap<String,ArrayList<Integer>> map = new HashMap<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            String s = arr.get(i);
            char word[]  = s.toCharArray();
            Arrays.sort(word);
            String newStr = new String(word);

            if(!map.containsKey(newStr)){
                ArrayList<Integer> indexList = new ArrayList<>();
                indexList.add(i+1);
                map.put(newStr,indexList);
            } else {
                ArrayList<Integer> getIndexList =  map.get(newStr);
                getIndexList.add(i+1);
                map.put(newStr,getIndexList);
            }
        }

        for(String s: map.keySet() ) {
            ArrayList<Integer> arrayListIndexes = map.get(s);
            list.add(arrayListIndexes);
        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        str.add("cat");
        str.add("dog");
        str.add("god");
        str.add("tac");

        ArrayList<ArrayList<Integer>> returnVal = anagramArr(str);

        for(int i=0;i<returnVal.size();i++){
            System.out.println(returnVal.get(i));
        }

    }

}