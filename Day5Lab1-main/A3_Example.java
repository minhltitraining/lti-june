package assignment;

public class Example implements InterOne{

    @Override
    public void methodOne() {
        System.out.println("Value of vartwo: " + varTwo);
        System.out.println("Good morning");
    }

    @Override
    public void methodTwo() {
        System.out.println("Good afternoon");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.methodOne();
        obj.methodTwo();
    }
}


