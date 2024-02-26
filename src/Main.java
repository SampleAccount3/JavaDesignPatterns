import java.lang.System;

public class Main {
    public static void main(String[] args) {

        // if the Lambda has only 1 Statement it automatically returns the statement
        System.out.println("Hello World");
        WhatKindOfanimal(new Dog());
        WhatKindOfanimal(new Cat());
    }

    public static void WhatKindOfanimal(Animal animal){
        animal.isWild();
        animal.Sound();
    }
}
