package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            throw new Error("age must be positive");
        }
        if (name.isEmpty()) {
            throw new Error("name must not be empty");
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public boolean isEmpty() {
        return this.name.isEmpty();
    }

    @Override
    public String toString() {
        return "family:" + family + "\n name:" + name + "\nage:" + age + "\n mamal:" + (isMammal ? " yes" : " no");
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new Error("name must not be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new Error("age must be positive");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

}
