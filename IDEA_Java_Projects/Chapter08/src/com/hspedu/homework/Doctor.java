package com.hspedu.homework;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    //重写 equals
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Doctor){
            Doctor doc = (Doctor) obj;
            return this.name.equals(doc.name) && this.age == doc.age
                    && this.job.equals(doc.job) && this.gender == doc.gender
                    && this.sal == doc.sal;
        }
        return false;
    }

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
