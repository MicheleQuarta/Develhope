package Java;

public class if_else1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Check se il numero è multiplo di 3 e 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
