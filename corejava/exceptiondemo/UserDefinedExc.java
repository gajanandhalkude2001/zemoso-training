package corejava.exceptiondemo;

import java.util.Scanner;

public class UserDefinedExc {
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       try {
           if (n < 10)
               throw new MyException("Erroror");
       }
       catch(MyException e)
       {
           System.out.println(e);
       }
   }
}
class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}
