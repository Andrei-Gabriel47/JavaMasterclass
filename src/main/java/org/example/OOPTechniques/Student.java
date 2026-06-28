package org.example.OOPTechniques;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Varsta trebuie sa fie pozitiva.");
        }
    }

    public void displayInfo() {
        System.out.println(name + " are " + age + " ani.");
    }
}