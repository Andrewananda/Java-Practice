import java.util.Scanner;
public class multy_method {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        MultipleMethods multipleMethodsObject = new MultipleMethods();
        System.out.println("Enter first girlfriend name here ");
        String temp = user.nextLine();
        multipleMethodsObject.setName(temp);
        multipleMethodsObject.saying();
    }

}
