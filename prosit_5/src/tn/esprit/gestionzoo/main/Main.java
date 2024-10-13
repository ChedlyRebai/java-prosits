package tn.esprit.gestionzoo.main;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
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
        Zoo zoo2 =new Zoo(animals, zooName, city, nbrcages);
        System.out.println("zoo animals");
        System.out.println(myZoo.addAnimal(tiger) ? tiger.getName()+" added succefully " : "error");
        System.out.println(myZoo.addAnimal(elephant) ? elephant.getName()+" added succefully " : "error");
        System.out.println(myZoo.addAnimal(giraffe) ? giraffe.getName()+" added succefully " : "error");
        System.out.println(myZoo.addAnimal(lion) ? lion.getName()+" added succefully " : "error");
        
       
        int index = myZoo.searchAnimal(lion);
        zoo2.addAnimal(giraffe);
        
        boolean animalRemoved=myZoo.removeAnimal(elephant);
        if(animalRemoved){
            System.out.println("animal removed");
        }else{
            System.out.println("animal not removed");
        }

        myZoo.addAnimal(lion);
        
        myZoo.displayAnimals();

        boolean zooIsFull=myZoo.isZooFull();
        if(zooIsFull){
            System.out.println("is full");
        }else{
            System.out.println("is not full");
        }
        
        if (index == (-1)) {
            System.out.println("not found");
        } else {
            System.out.println("found at index:" + index);
        }

        Zoo BigZoo=zoo2.comparerZoo(myZoo, zoo2);
        System.out.println("biggest Zoo: "+ BigZoo.getName());

        sc.close();



        //Prosit-5 update

    }
}