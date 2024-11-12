package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int newwint = 0;
    private Aquatic[] aquaticAnimals;
    private int newPos =0;


    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.aquaticAnimals=new Aquatic[10];
    }

    

    public void addAquaticAnimal(Aquatic aquatic){
        this.aquaticAnimals[newPos]=aquatic;
        this.newPos++;
    }

    public void displayAnimals() {

        System.out.print("zoo name: " + name + "\n city: " + city + " \nnb cages:" + nbrCages + "\n");

        for (Animal animal : animals) {
            if (animal != null) {

                // System.out.println("index of display animals: "+i);
                System.out.println(animal.toString());
            }

            if (animal == null) {
                return;
            }
        }
    }

    public int searchAnimal(Animal newAnimal) {
        int index = 0;
        for (Animal animal : animals) {
            if (animal == null) {
                break;
            }

            if ((animal.getName()).equals(newAnimal.getName())) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean isTheAnimalIsTheSame(Animal newAnimal) {
        for (Animal animal : animals) {
            if (animal == null) {
                break;
            }
            if (animal.equals(newAnimal)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        int indexOfAnimal = searchAnimal(animal);
        if (indexOfAnimal != (-1)) {
            for (int i = indexOfAnimal; i < newwint - 1; i++) {
                animals[i] = animals[i + 1];
                animals[i + 1] = null;
            }

            if (indexOfAnimal == (newwint - 1)) {
                animals[indexOfAnimal] = null;
            }
            newwint--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {

        int i = 0;
        for (Animal animal : animals) {
            if (animal == null) {
                break;
            }
            i++;

        }
        return (i == this.animals.length - 1);
    }

    public int animalsNumber() {
        int i = 0;
        for (Animal animal : animals) {
            if (animal == null) {
                break;
            }
            i++;

        }
        return i;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalsNumber() >= z2.animalsNumber()) {
            return z1;
        }

        // if(z2.animalsNumber()>z1.animalsNumber()){
        // return z2;
        // }

        return z2;
    }
    

    public boolean addAnimal(Animal newAnimal) throws ZooFullException, InvalidAgeException {
        if (newAnimal.getAge() < 0) {
            throw new InvalidAgeException("Animal age cannot be negative.");
        }

        if (isTheAnimalIsTheSame(newAnimal)) {
            System.out.println("Animal already exists in the zoo.");
            return false;
        }

        if (!this.isZooFull()) {
            animals[newwint] = newAnimal;
            newwint++;
            return true;
        } else {
            throw new ZooFullException("The zoo is full. Cannot add more animals.");
        }
    }



    //Instruction 29 :
    public float maxPenguinSwimmingDepth(){
        float max=0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            
            if(aquaticAnimal != null && aquaticAnimal instanceof Penguin){
                if (((Penguin) aquaticAnimal).getSwimmingDepth() > max) {
                    max = ((Penguin) aquaticAnimal).getSwimmingDepth();
                }
            }
        }
        return max;
    }

    //Instruction30
    public void displayNumberOfAquaticsByType(){
        int dauphins=0;
        int pingouins=0;
        for (Aquatic animal : this.aquaticAnimals) {
            if(animal instanceof Dolphin){
                dauphins++;
            }
            if(animal instanceof Penguin){
                pingouins++;
            }
        }
        System.out.println(" Dauphins :"+ dauphins);
        System.out.println("\nPingouis :"+pingouins);
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNewwint() {
        return newwint;
    }

    public void setNewwint(int newwint) {
        this.newwint = newwint;
    }

    
}
