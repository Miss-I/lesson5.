package ru.geekbrains.Moiseeva;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("%s %s %s %s %d %d\n", name, position, email, phoneNumber,salary, age);
    }
    public boolean olderThan40(){
        if (age>40){
            return true;
        } else return false;
    }
}
