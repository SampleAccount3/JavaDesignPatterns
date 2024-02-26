import java.lang.System;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        var editor  = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.RestoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
