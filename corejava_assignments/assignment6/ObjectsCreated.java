package corejava_assignments.assignment6;

public class ObjectsCreated {
    public ObjectsCreated(String arg) {
        System.out.println("Constructor called with argument: " + arg);
    }

    public static void main(String[] args) {
        ObjectsCreated[] arr = new ObjectsCreated[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ObjectsCreated("object " + i);
        }
    }
}
