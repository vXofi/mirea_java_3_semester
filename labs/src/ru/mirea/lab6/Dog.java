package ru.mirea.lab6;

abstract class Dog {
    private String name, size;
    private int age;
    public Dog(String name, String size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "dog\n name:" + this.getName() + "\nage: " + this.getAge() + "\nsize: " +
                this.getSize();
    }
}
