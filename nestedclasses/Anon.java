package nestedclasses;

public class Anon {
    public Anon() {
    }

    public void printThis() {
        System.out.println("Anon");
    }

    public void doThis(Anon other) {
        // do something here
        other.printThis();
    }
}
