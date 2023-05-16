package corejava_assignments.assignment7;

class Cycle {
    public void ride() {
        System.out.println("Riding a cycle");
    }
}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Balancing on one wheel");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Balancing on two wheels");
    }
}

class Tricycle extends Cycle {
    // Tricycles don't need to balance
}

public class Downcast {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Call ride() method on each element of the array
        for (Cycle c : cycles) {
            c.ride();
        }

        // Attempt to call balance() method on each element of the array
        // This will not compile because the balance() method is not declared in the Cycle class
        // for (Cycle c : cycles) {
        //     c.balance();
        // }

        // Downcast to call balance() method
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        // This will cause a ClassCastException at runtime because Tricycle cannot be cast to Unicycle or Bicycle
        // ((Unicycle) cycles[2]).balance();
    }
}
