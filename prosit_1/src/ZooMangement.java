import java.util.Scanner;

public class ZooMangement {
    public static void main(String args[]) {
        //Instruction 1
        //int nbrCages=20;
        //String zooName="my zoo";
        // System.out.println(String.format("%s comporte %d cages ", zooName,nbrCages));
        //result: my zoo comporte 20 cages


        //Instruction 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le nom du zoo:");
        String zooName=sc.nextLine();

        System.out.println("Entrez le nombre de cages:");
        int nbrCages=0;
        while (!sc.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide:");
            sc.next();
        }
        nbrCages = sc.nextInt();

        if(nbrCages ==1) {
            System.out.println(String.format("%s comporte %d cage ", zooName,nbrCages)) ;
        }

        if(nbrCages >1) {
            System.out.println(String.format("%s comporte %d cages ", zooName, nbrCages));
        }


    }
}
