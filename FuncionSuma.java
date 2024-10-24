import java.util.Scanner;

public class FuncionResta {

    private static int primerMinuendo;
    private static int segundoSustraendo; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce el primer minuendo:");
        primerMinuendo = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el segundo sustraendo:");
        segundoSustraendo = in.nextInt();
        in.nextLine();
        System.out.println("La resta es: " + resta(primerMinuendo, segundoSustraendo));
        
        in.close();
    }

    private static int resta(int minuendo, int sustraendo) {
        return minuendo - sustraendo; // Realiza la resta
    }
}
