package ch12;

public class Person {
    String name;
    int age;

    public Person(){
        this("yuseon",24);
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
    }

    public void showPerson(){
        System.out.println("name : " + name + ", age : "+age);
    }
    public static void main(String[] args){
        Person person = new Person();
        person.showPerson();
        System.out.println(person);
        System.out.println(person.getPerson());
    }

}
