package corejava.lambdaExpression;
interface Example
{
    int add(int a, int b);
}
public class Lambda {
    public static void main(String args[])
    {
        Example obj = (int a , int b)-> {
            System.out.println(a+b);
            return a+b ;};
        obj.add(10,29);
    }
}
