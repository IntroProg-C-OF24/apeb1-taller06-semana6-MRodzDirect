package week6;
import java.util.Scanner ;
public class ImpuestoEmpleados {
    public static void main(String[] args) {
        int inc ;
        double exp, imp = 0; 
        Scanner sc = new Scanner (System.in);
        System.out.println("Coloque su Ingreso Anual");
        inc = sc.nextInt();
        if (inc <= 10000){
            imp = 0.1;
        }
        else {
            if (inc >= 10001 && inc < 30000){
                imp = 0.15;
                        }
            else {
                if ( inc >= 30000){
                    imp = 0.2;
                }
                else {
                    System.out.println("El Ingreso de su salario anual no puede ser menor a 0, coloque el valor real");
                }
            } 
        } exp = inc * imp;
        imp = imp * 100;
        System.out.println("Usted debe pagar "+ exp+" $, es decir el "+imp+"% de su Ingreso anual ("+inc+" $)");
        
        if (exp>1000){
            System.out.println("Debes pagar un alto impuesto este año");
        }
        else {
            System.out.println("Tu impuesto es razonable");
            
        }
        // Por MRodz 😉
    }
}
    