package corejava.exceptiondemo;

public class ExceptionDemo {
    public static void main(String args[])
    {
        int i=5;
        int j=10; int k;
        try
        {
            k=j/i;

            throw new ArithmeticException();
        }
        catch(ArithmeticException a)
        {
            System.out.println("Arth Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OutOfBounds Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Done");
        }
    }
}
