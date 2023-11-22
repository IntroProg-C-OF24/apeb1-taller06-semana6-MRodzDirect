// Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.

package week6;

import java.util.Scanner;

public class E05_Num_A_OperMat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        System.out.println("Ingrese un número del 1 al 4 para determinar su operación matemática");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                op = "suma";
                break;
            case 2:
                op = "resta";
                break;
            case 3:
                op = "multiplicacion ;)";
                break;
            case 4:
                op = "division, hermano";
                break;
            default:
                op = "no nos time, esa operacion no existe :( (seleccione del 1 al 4)";
        }

        System.out.println("La operacion a realizarse es: " + op);
    }
}

//By MRodzDirect 😉
