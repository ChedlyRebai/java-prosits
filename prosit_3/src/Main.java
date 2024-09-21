import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        System.out.println(myZoo.addAnimal(tiger) ? "ee" : "e");
        
        //myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);
        int index = myZoo.searchAnimal(lion);
        zoo2.addAnimal(giraffe);
        myZoo.removeAnimal(elephant);
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

    }
}