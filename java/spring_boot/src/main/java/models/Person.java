package models;

public class Person {
    private final String name;
    private final int age;

    public Person(int age, String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
