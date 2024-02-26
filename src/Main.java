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
                System.out.println("This is a Anonymous Inner Class" + message);
            }
        });

        // lambda Expression syntax (arguments) -> Statements
        Greet( m -> System.out.println(m)); // Hello

        // the output is same as above
        // this is a method reference
        Greet(System.out::println); // Hello

        // assigning a lambda expression in a variable
        IPrintable iPrintable = System.out::println;
        iPrintable.Print("Iam the assigned Lambda");

        Arithmetic arithmetic = new Arithmetic();

        System.out.println( Add(new Arithmetic()));
//        System.out.println( Add((x,y)-> arithmetic::Compute(x,y)));
        System.out.println(Add(arithmetic));

        INumberable iNumberable = (x,y) -> Add(arithmetic::Compute);


        System.out.println( iNumberable.Compute(2,1));
    }

    public static void Greet(IPrintable iPrintable){
        iPrintable.Print("Hello");
        iPrintable.Print("Hello2");
    }

    public static float Add(INumberable iNumberable){
        return iNumberable.Compute(2,10);
    }
}
