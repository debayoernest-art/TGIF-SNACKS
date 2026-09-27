//write a function that takes an integer and returns the factorial of the number


public class Functions5 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));
    }

    public static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}
