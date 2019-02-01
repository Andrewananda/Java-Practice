public class MultipleMethods {
    private String girlName;
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first was %s",getName());
    }
}
