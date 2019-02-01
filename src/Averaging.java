import java.util.Scanner;
public class Averaging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ener grades ");
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        while (counter < 10){
            grade = input.nextInt();
            total = total + grade;
            counter ++;
        }
        average = total/10;
        System.out.println("Your average is  " + average);
    }
}
