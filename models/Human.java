package models;

public class Human {
    int id;
    String name;
    short age;

    public Human(int id, String name, short age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toString(){
        return "Hi, my name is "+ this.name + " and I'm " + this.age + " years old";
    }
}
