package corejava_assignments.assignment7;

abstract class Rodent {
    public Rodent() {
        System.out.println("This is a Rodent.");
    }
    public abstract void eat();
    public abstract void run();
}

class Mouse extends Rodent {
    public Mouse() {
        System.out.println("This is a Mouse.");
    }
    public void eat() {
        System.out.println("Mouse is eating.");
    }
    public void run() {
        System.out.println("Mouse is running.");
    }
}

class Gerbil extends Rodent {
    public Gerbil() {
        System.out.println("This is a Gerbil.");
    }
    public void eat() {
        System.out.println("Gerbil is eating.");
    }
    public void run() {
        System.out.println("Gerbil is running.");
    }
}

class Hamster extends Rodent {
    public Hamster() {
        System.out.println("This is a Hamster.");
    }
    public void eat() {
        System.out.println("Hamster is eating.");
    }
    public void run() {
        System.out.println("Hamster is running.");
    }
}

public class RodentHierarchy {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.run();
        }
    }
}

