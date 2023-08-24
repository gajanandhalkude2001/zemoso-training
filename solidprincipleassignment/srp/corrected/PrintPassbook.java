package solidprincipleassignment.srp.corrected;

public class PrintPassbook {
    public void printPassbook(String size)
    {
        if(size =="A4")
            System.out.println("Printing in A4");
        if(size == "A3")
            System.out.println("Printing in A3");
        if(size == "A2")
            System.out.println("Printing in A2");
    }
}
