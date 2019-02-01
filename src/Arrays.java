public class Arrays {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int array[] = {32,64,18,40,9,10};
        for (int counter=0;counter<array.length;counter++){
            System.out.println(counter + "\t" + array[counter]);
        }
        String arrayPeople[] = {"Andrew","Johnny","Brian","Clair"};
        for (int counter=1;counter<arrayPeople.length;counter++){
            System.out.println(counter + "\t" + arrayPeople[counter]);
        }
    }
}
