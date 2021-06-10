//EjercicioRepositorio13
import java.util.Scanner;
public class EjercicioRepositorio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char seleccion;
        double division, numero1, numero2, suma;         

        
 
        System.out.println("Ingrese el inciso la operacion que desea realizar: ");                     
        System.out.println("a = suma ");
        System.out.println("b = dividir");
    System.out.println("c = salir");
        seleccion = entrada.next().charAt(0);
        
        System.out.print("Ingrese el numero 1: ");
        numero1 = entrada.nextDouble();
        
        System.out.print("Ingrese el numero 2: ");
        numero2 = entrada.nextDouble();
        
            switch (seleccion){
                case 'A':
                case 'a':
                    suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                break;

                case 'B':
                case 'b':
                    division = numero1/numero2;
                    System.out.println("La division de "+numero1+" entre "+numero2+" es de "+division);
                break;

                case 'C':
                case 'c':
                    System.out.println("ADIOS");
                break;

                default: System.out.println("ERROR: OPCION NO VALIDA");

            }     
        
    }
}