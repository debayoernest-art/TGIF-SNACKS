// print ASCII values of characters A to Z




public class LittleLoopss {

    public static void main(String[] args) {

        char letter = 'A';

        while (letter <= 'Z') {
            System.out.println(letter + " = " + (int) letter);
            letter++;
        }
    }
}
