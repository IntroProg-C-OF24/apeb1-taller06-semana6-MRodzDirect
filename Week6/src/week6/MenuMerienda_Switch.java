
package week6;

import java.util.Scanner;

public class MenuMerienda_Switch {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
        System.out.println("Seleccione lo que desea merendar");
        System.out.println("[1] Chaulafan");
        System.out.println("[2] Repe");
        System.out.println("[3] Arroz con Pollo");
        System.out.println("[4] Tallarines");
        System.out.println("[5] Nose, nariz en ingles >:^");
        //Metodo con "if" y "else if"
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Chaulafan");
                break;
            case 2:
                System.out.println("Repe");
                break;
            case 3:
                System.out.println("Arroz con Pollo");
                break;
            case 4:
                System.out.println("Tallarines");
                break;
            case 5:
                System.out.println("Nose, nariz en ingles >:^");
                break;
            default:
                System.out.println("Su opcion elegida no se encuentra en el menu, ya nu es culpa :(");
                break;
        }
        // switch = optima para una variable a ser confirmada ; if, elseif = mejor para diferentes variables
       
        
    }
}

