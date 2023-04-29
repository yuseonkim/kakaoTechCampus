package Chapter4.ch04;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c1 = Class.forName("Chapter4.ch04.Person");

        Person person =  (Person)c1.newInstance();
        person.setName("Lee");
        System.out.println(person);

        Class c2 =  person.getClass();
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        
    }
}
