//isPalindrome(integer)-boolean: write a function that takes a 5-digit integer and returns true if it is a palindrome. Example: 54145-True



public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(54145));
        System.out.println(isPalindrome(12345));
    }

    public static boolean isPalindrome(int number) {

        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        return digit1 == digit5 && digit2 == digit4;
    }
}
