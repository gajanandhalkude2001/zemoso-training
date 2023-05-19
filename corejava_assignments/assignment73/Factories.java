package corejava_assignments.assignment73;

// Cycle interface
 interface Cycle {
    void ride();
}

// Unicycle class implementing Cycle
 class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Unicycle");
    }
}

// Bicycle class implementing Cycle
 class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Bicycle");
    }
}

// Tricycle class implementing Cycle
 class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a Tricycle");
    }
}

// Cycle factory interface
 interface CycleFactory {
    Cycle createCycle();
}

// Unicycle factory
 class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}

// Bicycle factory
 class BicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}

// Tricycle factory
 class TricycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}

// Main class demonstrating usage
public class Factories {
    public static void rideCycle(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        rideCycle(unicycle);

        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        rideCycle(bicycle);

        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        rideCycle(tricycle);
    }
}

