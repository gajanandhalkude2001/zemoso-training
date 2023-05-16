package corejava.multithreding;
class Threading extends Thread
{
    int count;
    @Override
    public void run()
    {
        count++;
        System.out.println(count);
    }

}

public class MyThread {
    public static void main(String args[])
    {
       Threading threading1 = new Threading();
       threading1.start();

       Threading threading2 = new Threading();
       threading2.start();
    }
}
