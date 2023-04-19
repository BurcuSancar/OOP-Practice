public class Cat {
    String name;
    String type;
    int age;
    Cat(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
    String namePlusType (){
        return name + " " + type;
    }

}
