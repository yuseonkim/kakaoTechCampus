package Chapter2.ch08;

public class Person {
    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;

    public Person(String name, int age, String sex, int height, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println("키가 "+ height +"이고 몸무게가 "+weight+ "킬로인 "+sex+"이 있습니다. 이름은 "+name+"이고 나이는 "+age+"세입니다.");
    }
}
