import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instruction 1
        //int nbrCages=20;
        //String zooName="my zoo";
       // System.out.println(String.format("%s comporte %d cages ", zooName,nbrCages));
        //result: my zoo comporte 20 cages

        //Instruction 2
        int nbrCages;
        String zooName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le nom du zoo");
        zooName=sc.nextLine();

        System.out.println("Entrez le nombre de cages");
        nbrCages=sc.nextInt();

        System.out.println(String.format("%s comporte %d cages ", zooName,nbrCages));
    }
}