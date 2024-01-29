abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class Abstruction{
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}

// show the Important data and hide non important data from user is called abstruction