package Chapter3.ch06;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다");
    }
    public void eating(){

    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}
class Lion extends Animal{
    @Override
    public void move(){
        System.out.println("사자가 네 발로 걷습니다.");
    }
    public void hunting(){
        System.out.println("사자가 사냥을 합니다");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 날라다닙니다.");
    }

    public void flying(){
        System.out.println("독수리가 양날개를 쭈욱 폅니당");
    }
}

public class AnimalTest {
    public static void main(String[] args){
        Animal hAnimal = new Human();
        Animal lAnimal = new Lion();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(lAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(lAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList){
            animal.move();
        }


    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
