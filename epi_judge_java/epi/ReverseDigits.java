package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class ReverseDigits {
  @EpiTest(testDataFile = "reverse_digits.tsv")
  public static long reverse(int x) { //don't use arrays, constant space complexity O(1) //dont use string builder

   long finalval=0;
  // int lenghtofx= Integer.toString(x).length();
   while (x!=0){
  //  lenghtofx= Integer.toString(x).length();
     finalval =finalval*10;
     finalval=finalval+x%10;
     x=x/10;
   }
 
   return finalval;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "ReverseDigits.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
