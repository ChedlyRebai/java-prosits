public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayAnimals() {
        System.out.print("zoo name: " + name + "\n city: " + city + " \nnb cages:" + nbrCages + "\n");
        for (Animal animal : animals) {
            System.out.println(animal.displayAnimal());
        }
    }

    


}