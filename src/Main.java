import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(fizzBuzz(16));
    }

    public static ArrayList fizzBuzz(int n) {
        ArrayList arr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                arr.add("FizzBuzz");
            } else if ((i % 3 == 0)) {
                arr.add("Fizz");
            } else if ((i % 5 == 0)) {
                arr.add("Buzz");
            } else {
                arr.add(i);
            }
        }
        return arr;
    }
}