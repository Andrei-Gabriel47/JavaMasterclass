package org.example.OOPTechniques;

public class MainOOP {
    public static void main(String[] args) {
        //Encapsulation
        Student student = new Student("Ana", 20);
        student.displayInfo();
        student.setAge(21);
        System.out.println(student.getName() + " are acum " + student.getAge() + " ani.");

        //Inheritance
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Miti");

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();

        //Polymorphism
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        System.out.println("Aria cercului: " + shape1.getArea());
        System.out.println("Aria dreptunghiului: " + shape2.getArea());
    }
}