import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HouseManager oraziosHouse = new HouseManager();
        int scelta;
        boolean x = true;
        while(x) {
            System.out.println("1.Gestione stanze\n2.Gestione piscina\n3.Visualizza stanze e piscina/e con relativi dispositivi\n4.");
            System.out.print("Cosa vuoi fare? ");
            scelta = userInput.nextInt();

            switch (scelta) {
                case 1:

                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }
    }
}