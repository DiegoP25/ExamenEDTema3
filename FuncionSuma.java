import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

/**
 * Clase que realiza una operación de resta entre dos números.
 */
public class FuncionResta {

    // Declara las variables para los sumandos
    private static int primerMinuendo;
    private static int segundoSustraendo; 

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner in = new Scanner(System.in);
        
        // Solicita el primer minuendo
        System.out.println("Introduce el primer minuendo:");
        primerMinuendo = in.nextInt(); // Lee el primer número
        in.nextLine(); // Consume el salto de línea

        // Solicita el segundo sustraendo
        System.out.println("Introduce el segundo sustraendo:");
        segundoSustraendo = in.nextInt(); // Lee el segundo número
        in.nextLine(); // Consume el salto de línea

        // Calcula y muestra la resta
        System.out.println("La resta es: " + resta(primerMinuendo, segundoSustraendo));
        
        in.close(); // Cierra el escáner
    }

    /**
     * Método que realiza la resta entre dos números.
     *
     * @param minuendo El número del cual se resta.
     * @param sustraendo El número que se resta.
     * @return El resultado de la resta.
     */
    private static int resta(int minuendo, int sustraendo) {
        return minuendo - sustraendo; // Retorna el resultado de la resta
    }
}
