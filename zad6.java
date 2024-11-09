import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("witaj w kalulatorze");
        System.out.println("wprowadz kwote jaka zarobilese: ");
        double Sal = scanner.nextDouble();

        if(Sal <= 85.528 && Sal != 0) {
            double NewSal = (Sal- 0.18 - 556.02);
            System.out.println(NewSal);

        }
        else if(Sal > 85.528){
            double nad = Sal - 85528;
            double NewSal2 = (Sal - 14839.02) + 0.32*nad;
            System.out.println(NewSal2);
        }
    }
}
