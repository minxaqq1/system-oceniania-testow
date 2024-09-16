import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("How much points did you get");
       Scanner scanner = new Scanner(System.in);
       int points = scanner.nextInt();
       scanner.close();
       if (points < 50) {
           System.out.println("you have to practice more");
       }
        else if (points > 50 && points < 70) {
            System.out.println("you are on good way");
       }
        else if (points > 70) {
            System.out.println("you are the best");
       }
    }
}