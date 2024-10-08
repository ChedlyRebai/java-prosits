public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String displayAnimal() {
        return "family:" + family + "\n name:" + name + "\nage:" + age + "\n mamal:" + (isMammal ? " yes" : " no");
    }

    
}