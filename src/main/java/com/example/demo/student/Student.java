package com.example.demo.student;

import java.time.LocalDate;

public class Student {

    private long id ;
    private String name ;
    private Integer age;
    private LocalDate dob ;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Student (){

    }
    public Student(long id, String name, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;

    }

    public Student( String name, Integer age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }


}
