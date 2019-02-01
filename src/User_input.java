import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        double fnum, snum, answ;
        System.out.println("Enter first num: ");
        fnum = user.nextDouble();
        System.out.println("Enter second num: ");
        snum = user.nextDouble();
        answ = fnum + snum;
        System.out.println("The answer is " + answ);
    }
    public void message(){
        System.out.println("message from user input");
    }
}
