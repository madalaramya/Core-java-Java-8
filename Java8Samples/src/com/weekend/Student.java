package com.weekend;
class Student {
    String name;
    int id;

    // Regular constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // "Copy constructor"
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
    }

    void display() {
        System.out.println(name + " " + id);
    }


    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        
        
        Student s2 = new Student(s1); // Creating a new student object s2 copying s1
        s1 = new Student("John2", 101);
        s2=new Student("John2", 104);
        s1.display();
        s2.display();
    }
    }
