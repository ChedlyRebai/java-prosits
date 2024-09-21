import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String zooName = "esprit";
        String city = "tunis";
        int nbrcages = -1;
        Scanner sc = new Scanner(System.in);
        Animal lion = new Animal("lion", "Lion", 3, true);
        Animal tiger = new Animal("tiger", "Tiger", 4, true);
        System.out.println("enter a valid number and must be less than 25:");
        
    
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Enter a valid number:");
                sc.next();  
            } else {
                nbrcages = sc.nextInt();
                if (nbrcages <= 25) {
                    break; 
                } else {
                    System.out.println("The number must be less than or equal to 25.");
                }
            }
        }
        
        System.out.println("Number of cages: " + nbrcages);
        
      
        Animal[] animals = { lion, tiger };

        Zoo myZoo = new Zoo(animals, zooName, city, nbrcages);
        System.out.println("zoo animals");
        myZoo.displayAnimals();

    }
}