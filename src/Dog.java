public class Dog implements IAnimalable{


    @Override
    public String sound(String suffix) {
        System.out.println("Woof");
        return "";
    }
}
