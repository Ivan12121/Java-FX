package com.example.delcraetestud;

public class Student {
    public int id;
    public String name;
    public int idFacultet;

    public Student(int id, String name, int idFacultet) {
        this.id=id;
        this.name=name;
        this.idFacultet = idFacultet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idFacultet=" + idFacultet +
                '}';
    }
}
