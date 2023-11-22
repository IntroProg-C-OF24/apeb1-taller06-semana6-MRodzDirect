// Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:
package week6;

import java.util.Scanner;

public class E02_ClaseTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el largo de los 3 lados del triángulo (Y te dire su clase ️🔎).");
        float lado1 = sc.nextFloat();
        float lado2 = sc.nextFloat();
        float lado3 = sc.nextFloat();
        float sum = 0, big;
       
        if(lado1 >= lado2){
            sum += lado2; 
            big = lado1;
        }else{
            sum += lado1; 
            big = lado2;
            
        }
        
        if(big <= lado3){
            sum += big;
            big = lado3;
        }else{
           sum += lado3; 
        }
        
        
        if(sum < big){
            System.out.println("No es triángulo");
        }else if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Es triángulo equilátero");
        }else if(lado1 == lado2 || lado2 == lado3){
            System.out.println("Es triángulo isósceles");
        }else{
            System.out.println("Es triángulo escaleno");
        }
        
        
    }
}
// By MRodzDirect 😉