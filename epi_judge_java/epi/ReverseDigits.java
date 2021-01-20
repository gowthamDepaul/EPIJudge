package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class ReverseDigits {
  @EpiTest(testDataFile = "reverse_digits.tsv")
  public static long reverse(int x) { //don't use arrays, constant space complexity O(1) //dont use string builder
   System.out.println(x);
   StringBuilder strNum = new StringBuilder(); //string concatenation runtime O(n^2), string builder O(n), immutability
   System.out.println("teststring");
   String temp = Integer.toString(x);
   System.out.println(temp);
  // int[] newGuess = new int[temp.length()];
  int counter=0;
   for (int i = temp.length()-1; i >-1; i--)
   {
    
       //newGuess[counter] = temp.charAt(i) - '0';
       
      // System.out.println(newGuess[counter]);
       strNum.append(temp.charAt(i) - '0');
       counter+=1;
   }
   int finalInt=Integer.parseInt(strNum.toString());
   
   System.out.println(finalInt);
   return finalInt;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "ReverseDigits.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
