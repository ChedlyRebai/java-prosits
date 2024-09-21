public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int newwint = 0;

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayAnimals() {

        System.out.print("zoo name: " + name + "\n city: " + city + " \nnb cages:" + nbrCages + "\n");

        for (Animal animal : animals) {
            if (animal != null) {

                // System.out.println("index of display animals: "+i);
                System.out.println(animal.displayAnimal());
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

    public boolean addAnimal(Animal newAnimal) {
        if (isTheAnimalIsTheSame(newAnimal)) {
            System.out.println("noo");
            return false;
        }
        if (newwint < nbrCages) {
            animals[newwint] = newAnimal;
            newwint++;
            return true;
        }

        return false;

        /*
         * int indies=animals.length;
         * System.out.println("index"+indies);
         * //System.out.println("ee"+animals[indies-1].displayAnimal());
         * System.out.println("b"+animals.length);
         * int newIndex=0;
         * for(Animal animal: animals){
         * System.out.println("new"+newIndex);
         * if(!animal.isEmpty()){
         * newIndex++;
         * break;
         * }
         * }
         */

        // System.out.println("new"+newIndex);
        // animals[indies]=newAnimal;
        // System.out.println("a"+animals.length);
        /*
         * if(animals.length <nbrCages){
         * int index=animals.length+1;
         * System.out.println("index"+index);
         * System.out.println("ee"+animals[index]);
         * 
         * }
         */
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
