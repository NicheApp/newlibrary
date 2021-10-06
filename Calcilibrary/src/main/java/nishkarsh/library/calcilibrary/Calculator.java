package nishkarsh.library.calcilibrary;

public class Calculator {

   public int calculate(String a){

       String operators[]=a.split("[0-9]+");
       String operands[]=a.split("[+-]");
       int agregate = Integer.parseInt(operands[0]);
       for(int i=1;i<operands.length;i++){
           if(operators[i].equals("+"))
               agregate += Integer.parseInt(operands[i]);
           else
               agregate -= Integer.parseInt(operands[i]);
       }
       return agregate;
   }
}
