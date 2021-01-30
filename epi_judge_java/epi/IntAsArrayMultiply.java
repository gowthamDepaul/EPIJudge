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
    int carroversum=0;
    int firstcounter=0;
    int symbol = 0;
    // num1.clear();
    // num2.clear();
    // num1.add(1);
    // num1.add(2);
    // num1.add(2);
    // num2.add(1);
    // num2.add(2);
    if((num1.get(0)<0) && (num2.get(0)<0)){
      symbol=1;

    }
    else if((num1.get(0)>0) && (num2.get(0)>0))
    {
      symbol=1;
    }
    else{
      symbol=-1;
    }
    for (int i=num1.size()-1; i>-1;i--){

      for (int j=num2.size()-1;j>-1;j--){
        
        int f1=num1.get(i);
        int f2=num2.get(j);
        if(f1<0){
          f1=-f1;
        }
        if(f2<0){
          f2=-f2;
        }
        int multf=(f1*f2)+carryover;
        carryover=0;
        int length = String.valueOf(multf).length();
        if(length>1){
          //String temp = Integer.toString(multf);
          carryover=multf/10;
            if(multf<0){
              if(length>=2){
              multf=-multf;
            }
            }
          finalinteger.add(0,multf%10);

          if(j==0){
            if(carryover<0){
            finalinteger.add(0,-carryover);
          }
          else{
            finalinteger.add(0,carryover);
          }
          }
          //intlist.add(i, finalres);
        }
        else{
          carryover=0;
          if(multf<0){
            finalinteger.add(0, -multf);
          }
          else{
          finalinteger.add(0, multf);
        }
        }

       // finalmulholder.add(5, 3);

      }
      
      if(firstcounter==0){
    

      finalpushinteger.addAll(finalinteger);
      firstcounter+=1;
      finalinteger.clear();
      continue;
    }
    if(firstcounter>0){
      carryover=0;
      int sizeofprefinal=finalinteger.size();
      for (int o=0;o<firstcounter;o++){
        sizeofprefinal=finalinteger.size();
        finalinteger.add(sizeofprefinal,0);
      }
      
      int sizeoffinal=finalpushinteger.size();
      //int tempobj=finalpushinteger.remove(sizeoffinal-firstcounter);
     // finalpushinteger.add(sizeoffinal-1,0);
      
      int differnce=sizeofprefinal-sizeoffinal;
      for (int l=0;l<=differnce;l++){
      finalpushinteger.add(0,0);
      }


     // firstcounter+=1;
    //finalpushinteger.add(sizeoffinal-1,0);

      //finalpushinteger.addAll(finalinteger);
      for(int k=sizeofprefinal;k>-1;k--){
        int sum=0;
        if(k>0){
         sum=carroversum+finalinteger.get(k)+finalpushinteger.get(k);
        
      }
      if(k==0){
         sum=carroversum+finalinteger.get(k);
      }
        carroversum=sum/10;
        finalpushinteger.set(k,sum%10);
      }
      carroversum=0;
   //   int lenoffinal=finalpushinteger.size();
     // finalpushinteger.add(lenoffinal,tempobj);


      firstcounter+=1;
      finalinteger.clear();
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
