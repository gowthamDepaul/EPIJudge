package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class ReverseDigits {
  @EpiTest(testDataFile = "reverse_digits.tsv")
  public static long reverse(int x) { //don't use arrays, constant space complexity O(1) //dont use string builder
  int inputnum=x;
  if(x<0){
    inputnum=-(inputnum);
  }
   long finalval=0;
   while (inputnum>0){
     finalval =finalval*10;
     finalval=finalval+inputnum%10;
     inputnum=inputnum/10;
     System.out.println(inputnum);

   }
   if(x<0){
    return -finalval;
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
