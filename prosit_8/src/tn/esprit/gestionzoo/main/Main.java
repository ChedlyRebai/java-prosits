package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        String zooName = "esprit";
        String city = "tunis";
        int nbrcages = 4;
        Scanner sc = new Scanner(System.in);
        Animal lion = new Animal("lion", "Lion", 3, true);
        Animal tiger = new Animal("tiger", "Tiger", 4, true);
        Animal elephant = new Animal("elephant", "Elephant", 10, true);
        Animal giraffe = new Animal("giraffe", "Giraffe", 5, true);
        // System.out.println("enter a valid number and must be less than 25:");
        /*
         * while(!sc.hasNextInt() || sc.nextInt() > 25){
         * System.out.println("enter a valid number and must be less than 25:");
         * sc.next();
         * }
         * 
         * nbrcages=sc.nextInt();
         */

        Animal[] animals = {};
        Zoo myZoo = new Zoo(animals, zooName, city, nbrcages);
        Zoo zoo2 = new Zoo(animals, zooName, city, nbrcages);
        System.out.println("zoo animals");

        int index = myZoo.searchAnimal(lion);
 
        boolean animalRemoved = myZoo.removeAnimal(elephant);
        if (animalRemoved) {
            System.out.println("animal removed");
        } else {
            System.out.println("animal not removed");
        }


        myZoo.displayAnimals();

        boolean zooIsFull = myZoo.isZooFull();
        if (zooIsFull) {
            System.out.println("is full");
        } else {
            System.out.println("is not full");
        }

        if (index == (-1)) {
            System.out.println("not found");
        } else {
            System.out.println("found at index:" + index);
        }

        Zoo BigZoo = zoo2.comparerZoo(myZoo, zoo2);
        System.out.println("biggest Zoo: " + BigZoo.getName());

        sc.close();

        // Prosit-5 update
        System.out.println("----------------------PROSIT-5---------------------------------");

        // Aquatic aquatic = new Aquatic("shark", "Shark", 5, false, "ocean");
        // System.out.println(aquatic.toString());

        Dolphin dolphin = new Dolphin("dolphin", "Dolphin", 2, true, city, 10);
        System.out.println(dolphin.toString());

        Penguin penguin = new Penguin("penguin", "Penguin", 1, true, city, 5);
        System.out.println(penguin.toString());

        // prosit_6
       // myZoo.addAquaticAnimal(aquatic);

        // Instruction 28
        for (Animal animal : myZoo.getAnimals()) {
            
                if (animal != null && animal.getClass() == Aquatic.class) {
                    Aquatic aquaticAnimal = (Aquatic) animal;
                    aquaticAnimal.swim();
                }
            
        }

    }



    
}