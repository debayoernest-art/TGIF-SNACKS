//Write a program that uses a while loop to compute the product of integers from 1 to 10



public class LittleLoops2 {

    public static void main(String[] args) {

        int product = 1;
        int i = 1;

        while (i <= 10) {
            product = product * i;
            i++;
        }

        System.out.println("Product = " + product);
    }
}

