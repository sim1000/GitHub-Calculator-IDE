package Calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        Variable variable = new Variable();

        System.out.println(variable.a + variable.b);
        System.out.println(variable.a - variable.b);
        System.out.println(variable.a / variable.b);
        System.out.println(variable.a * variable.b);
    }
}


