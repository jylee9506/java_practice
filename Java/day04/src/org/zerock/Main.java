package org.zerock;

public class Main {

    public static void main(String[] args) {

        BMIService service = new BMIService();

        Person p1 = new Person(180,60);

        double result = service.calculate(p1);

        System.out.println(result);

    }
}