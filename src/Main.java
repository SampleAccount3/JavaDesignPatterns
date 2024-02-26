import java.lang.System;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        // uses the Printer class as an argument
        Greet(new Printer()); // message

        // anonymous Inner Class
        Greet(new IPrintable() {
            @Override
            public void Print(String message) {
                System.out.println("This is a Anonymous Inner Class");
            }
        });

        // lambda Expression
        Greet( m -> System.out.println(m)); // Hello

        // the output is same as above
        Greet(System.out::println); // Hello
    }

    public static void Greet(IPrintable iPrintable){
        iPrintable.Print("Hello");
    }
}
