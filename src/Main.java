import java.lang.System;

public class Main {
    public static void main(String[] args) {

        // if the Lambda has only 1 Statement it automatically returns the statement
        System.out.println("Hello World");
        Dog dog = new Dog();

        // Creating an instance of a Dog to Print "Woof"
        dog.sound("!");

        // Using the PrintThing Method to Call the IAnimalable method inside the Dog Class
        PrintThing(dog);

        // Creating an action in the Variable type Ianimalable
         IAnimalable Lambda = (s) -> "Woof"+s;

        // Using the Lambda variable as an argument for the PrintThing
        PrintThing(Lambda);
        System.out.println(Lambda.sound(""));

        int x = 2,y = 5;
        IAnimalable Lambda2 = (s) -> "Kangkong" + s + (x + y);
        PrintThing(Lambda2);

        System.out.println(PrintThingReturn(Lambda));
    }
    public static void PrintThing(IAnimalable iAnimalable){
        iAnimalable.sound("!");
    }
    public static String PrintThingReturn(IAnimalable iAnimalable){
        return iAnimalable.sound("2");
    }
}
