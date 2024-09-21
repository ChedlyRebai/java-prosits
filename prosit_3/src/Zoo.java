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
        int i = 0;
        System.out.print("zoo name: " + name + "\n city: " + city + " \nnb cages:" + nbrCages + "\n");
        for (Animal animal : animals) {
            i++;
            System.out.println("i" + i);
            if (animal != null) {
                System.out.println("continue");
                System.out.println(animal.displayAnimal());

            }
            if (animal == null) {
                System.out.println("null");
                return;
            }
        }
    }

    public int searchAnimal(Animal newAnimal){
        int index=0;
        for (Animal animal : animals) {
            if((animal.getName()).equals(newAnimal.getName())){
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean addAnimal(Animal newAnimal) {

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
