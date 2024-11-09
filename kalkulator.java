import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double suma;

        System.out.println("witaj w kalulatorze");
        System.out.println("Wprowadz pierwsza wartość(musi byc mniejsza od 2): ");
        double liczbaA = scanner.nextDouble();
        System.out.println("Wprowadz druga wartość: ");
        double liczbaB = scanner.nextDouble();
        double x = 0;

        if(liczbaA == (int)liczbaA){
            System.out.println("jest calkowita");
                if( liczbaB>liczbaA){
                    for(double i = liczbaA; i <= liczbaB; i++);
                    x += 1;
                }
                else{
                    System.out.println("wprowadzona liczba nie jest  program sie nie wykona");
                }

                System.out.println(x);
        }
        else{
            System.out.println("wprowadzona liczba nie jest calkowita program sie nie wykona");
        }


    }
}
