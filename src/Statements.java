public class Statements {
    public static void main(String[] args) {

        int age;
        age = 12;
        switch (age){
            case 1:
                System.out.println("can crawl");
                break;
            case 2:
                System.out.println("can talk");
                break;
            case 3:
                System.out.println("can get in trouble");
                break;
            case 12:
                System.out.println("can join highschool");
                break;
                default:
                    System.out.println("I do not know your age");
                    break;
        }
        tuna tunaObject = new tuna();
        tunaObject.message();
    }
}
