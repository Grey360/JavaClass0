import java.util.Scanner;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        System.out.println(res);
        printName();
        Imprimante imprimante = new Imprimante();
        System.out.println(imprimante.getNom());
        Scanner name = new Scanner(System.in);
        imprimante.setNom(name.nextLine());
        System.out.println(imprimante.getNom());
    }

    /**
     * @deprecated use {@link printName()} instead.
     */
    public static void printNom(){
        System.out.println("Nom");
    }
    public static void printName(){
        System.out.println("Nom");
    }
}
