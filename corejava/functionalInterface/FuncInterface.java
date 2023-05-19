package corejava.functionalInterface;
@FunctionalInterface
interface Anonymous
{
    void method();
}
public class FuncInterface {
    public static void main(String args[])
    {
        Anonymous obj = new Anonymous() {
            @Override
            public void method() {
                System.out.println("Anynomous Method/Class");
            }
        };
    }
}
