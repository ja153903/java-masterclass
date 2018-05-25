package nestedclasses;

public class Main {
    public static void main(String[] args) {
        Anon a = new Anon();

        // we can pass in an anonymous class and override the functionality
        a.doThis(new Anon() {
            @Override
            public void printThis() {
                System.out.println("We're printing this instead");
            }
        });
    }
}
