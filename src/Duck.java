public class Duck {
    String name;
    int age;
    String color;
    public Duck(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void fly(int distance){
        System.out.println(color+" утка "+name+" пролетела "+distance+" метров.");
    }
}
