import java.util.Scanner;
public class Method_calls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method_called method_calledMethod = new method_called();
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        method_calledMethod.user_data(name);

    }
}
