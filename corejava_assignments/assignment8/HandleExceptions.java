package corejava_assignments.assignment8;

import java.security.spec.ECFieldF2m;
import java.util.Scanner;

public class HandleExceptions {
    public static void main(String args[])
    {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        n=sc.nextInt();
        System.out.println("Enter m number");
        m=sc.nextInt();
        try
        {
            if(n<0)
                throw new MyNegitiveException("Negitive Number");
            if(m % 2 ==0)
                throw new MyEvenException("Even Number Exception");
            throw new MyException("MyException");
        }
//        catch(MyEvenException e)
//        {
//            System.out.println("Even number Exception");
//        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Handled all Exceptions");
        }
    }
}
class MyNegitiveException extends Exception
{
    public MyNegitiveException(String str)
    {
        super(str);
    }
}
class MyEvenException extends Exception
{
    public MyEvenException(String str)
    {
        super(str);
    }
}
class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}
