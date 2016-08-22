package com.mycompany.WMQ_POC;

public class Person {
    private String name;
    private Integer age;
    private Integer id;

    public Person(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person() {
    }
    
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;

        return true;
    }
}
