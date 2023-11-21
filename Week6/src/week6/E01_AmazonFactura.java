// Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos. Requesitos especificados en el taller
package week6;
import java.util.Scanner;
public class E01_AmazonFactura {
    public static void main(String[] args) {
         float iva, prod1, prod2 = 0, prod1N, prod2N, stprod1, stprod2, st, civa1, civa2, ivap, stiva, stivadesc, costenvio, tot;
         iva = 0.12f;
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el costo de su primer producto: ");
         prod1 = sc.nextFloat();
         System.out.println("Ingrese las unidades de su primer producto: ");
         prod1N = sc.nextFloat();
         System.out.println("Ingrese el costo de su segundo producto: ");
         prod2 = sc.nextFloat();
         System.out.println("Ingrese  las unidades de su segundo producto: ");
         prod2N = sc.nextFloat();
         stprod1= prod1*prod1N;
         stprod2= prod2*prod2N;
         st= stprod1 + stprod2;
         //civa1 = iva*stprod1; alternate-path
         //civa2 = iva*stprod2; alternate-path
         ivap = (stprod1+stprod2)*iva;
         stiva= ivap+st;
         
         System.out.printf("El subtotal de su primer producto es: %.2f", stprod1);
         System.out.println("");
         System.out.printf("El subtotal de su segundo producto es: %.2f", stprod2);
         System.out.println("");
         System.out.printf("Por lo tanto el subtotal de su carrito de compra es: %.2f",st);
         System.out.println("");
         System.out.printf("El IVA que usted pagara es: %.2f",ivap);
         System.out.println("");
         System.out.printf("Su subtotal + IVA es: %.2f",stiva);
         
         
         if (stiva>1000) {
             stivadesc = stiva * 0.2f;
             System.out.println("");
             System.out.printf("Su descuento es de: %.2f", stivadesc);
         }
         else {
             stivadesc = stiva * 0.05f;
             System.out.println("");
             System.out.printf("Su descuento es de: %.2f", stivadesc);
         }
         if (st>5000) {
             costenvio = 0;
             System.out.println("");
             System.out.printf("Su envio es de: %.2f $, por su compra superior a 5000$!, gracias por su compra!",costenvio);
         } else {
             costenvio = 100;
             System.out.println("");
             System.out.printf("Sus costos de envio son: %.2f",costenvio);
         }
         tot= (stiva-stivadesc)+costenvio;
         System.out.println("");
         System.out.printf("Total a pagar: %.2f ",tot);
         System.out.println("");
         System.out.println("Gracias, vuelva pronto");
    // %xf = where x is the number of decimal places, f is the "variable" that will be formated in the place where "%" begins.
    // Remind: This can only be done inside printf , not on println
    }
   
    
}
// By MRodzDirect 😉