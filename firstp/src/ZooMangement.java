import java.util.Scanner;

public class ZooMangement {
    public static void main(String[] args) {
        // int nbCages=20;
        // String zooName="my zoo";
        // System.out.println(zooName+"comporte "+nbCages+" cages");

        Scanner scan=new Scanner(System.in);
        System.out.println("donner un nom:\n");
        String zooName=scan.nextLine();
        System.out.println("donner un nombre:\n");
        int nbCages=scan.nextInt();
        System.out.println(zooName+" comporte "+nbCages+" cages");

    }
}
