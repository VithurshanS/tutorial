class Monster{
    private int age;
    private String name;
    public Monster(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }
    public Monster(int age,String name){
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }

}

public class Test1{
    public static void main(String[] args){
        Monster mon = new Monster("vithu",23);
    }
}