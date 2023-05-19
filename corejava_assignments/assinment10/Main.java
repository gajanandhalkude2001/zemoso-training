package corejava_assignments.assinment10;

public class Main {
    public static void main(String args[]) {
        SList sList = new SList();
        SListIterator sListIterator = sList.iterator();
        sListIterator.insert(1);
        sListIterator.insert(2);
        sListIterator.insert(3);
        sListIterator.remove(2);
        System.out.println(sList.toString(sListIterator));
    }
}
