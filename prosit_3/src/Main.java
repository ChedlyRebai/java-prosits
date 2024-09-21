import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String zooName = "esprit";
        String city = "tunis";
        int nbrcages = 3;
        Scanner sc = new Scanner(System.in);
        Animal lion = new Animal("lion", "Lion", 3, true);
        Animal tiger = new Animal("tiger", "Tiger", 4, true);
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
        System.out.println("zoo animals");
        System.out.println(myZoo.addAnimal(tiger) ? "ee":"e" );
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        int index=myZoo.searchAnimal(tiger);
        if(index==(-1)){
            System.out.println("not found");
        }else{
            System.out.println("found at index:"+index);
        }

        sc.close();

    }
}