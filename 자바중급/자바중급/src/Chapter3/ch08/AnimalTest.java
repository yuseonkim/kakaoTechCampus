package Chapter3.ch08;

import java.lang.reflect.Array;
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

        test.testDownCasting(animalList);

    }
    public void testDownCasting(ArrayList<Animal> list){
        for(int i=0;i<list.size();i++){
            Animal animal = list.get(i);
            if(animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();;
            }
            if(animal instanceof Lion){
                Lion lion = (Lion) animal;
                lion.hunting();
            }
            if(animal instanceof Eagle){
                Eagle  eagle = (Eagle) animal;
                eagle.flying();
            }
            else{
                System.out.println("Unsupported Type");
            }

        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
