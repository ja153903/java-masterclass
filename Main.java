import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Tim");

        // we should notice that we can't do the above function
        // with a primitive type.

        // we would then need autoboxing (using a wrapper for that class)
        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(10);



    }
}
