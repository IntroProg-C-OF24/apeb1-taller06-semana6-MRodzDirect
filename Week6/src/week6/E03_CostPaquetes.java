// Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
package week6;

import java.util.Scanner;

public class E03_CostPaquetes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costo;
        System.out.println("Ingrese el peso del paquete en kilos (kg): ");
        float peso = sc.nextFloat();
        
        System.out.println("Ingrese la región: local o nacional");
        String region = sc.next();

        if (peso < 5 && region.equals("local")) {
            costo = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costo = 10;
        } else {
            costo = 15;
        }
        
        System.out.println("El costo de envio para su paquete es : " + costo + " $");
    }
}
// By MRodzDirect 😉