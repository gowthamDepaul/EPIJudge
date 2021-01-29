package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.ArrayList;
import java.util.List;
public class IntAsArrayMultiply {
  @EpiTest(testDataFile = "int_as_array_multiply.tsv")
  public static List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
    // TODO - you fill in here.
    //List<Integer> intlist= new List<Integer>;
   // intlist.add(0);
   ArrayList<Integer> finalinteger = new ArrayList<>();
   List<Integer> finalpushinteger = new ArrayList<>();
    int carryover=0;
    int firstcounter=0;
    for (int i=num1.size()-1; i>0;i--){

      for (int j=num2.size()-1;j>0;j--){
        int f1=num1.get(i);
        int f2=num2.get(j);
        int multf=(f1*f2)+carryover;
        carryover=0;
        int length = String.valueOf(multf).length();
        if(length>1){
          String temp = Integer.toString(multf);
          carryover=temp.charAt(0);
          finalinteger.add(0,(int)temp.charAt(1));
          
          //intlist.add(i, finalres);
        }
        else{
          carryover=0;
          
          finalinteger.add(0, multf);

        }

       // finalmulholder.add(5, 3);

      }
      if(firstcounter==0){
    

      finalpushinteger.addAll(finalinteger);
      firstcounter+=1;
      continue;
    }
    if(firstcounter>0){
      int sizeofexsistingfinal=finalinteger.size();
      int tempobj=finalpushinteger.remove(sizeofexsistingfinal-1);
      finalpushinteger.addAll(finalinteger);
      int lenoffinal=finalpushinteger.size();
      finalpushinteger.add(lenoffinal,tempobj);



      //find length of exsisting list]
    }

    }
    return null;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IntAsArrayMultiply.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
