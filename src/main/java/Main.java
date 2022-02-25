import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 0 - 10");

        Random randomNum = new Random();
        int num = randomNum.nextInt(10);
        int count = 0;
        while (true) {
            int guess = scanner.nextInt();
            count++;
            if (guess > num) {
                System.out.println("too large");
            } else if (guess < num) {
                System.out.println("too small");
            } else {
                System.out.println("correct guess");
                System.out.println("It took you " + count + " guesses");
                break;
            }
        }
    }
}