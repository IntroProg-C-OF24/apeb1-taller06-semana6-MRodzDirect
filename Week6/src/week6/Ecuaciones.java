package week6;

public class Ecuaciones {

    public static void main(String[] args) {
   // Declarar variables
        float x = 2;
        float y = 0;
        
        if (x>=-3 && x <=2){
            y= (float) (Math.pow(x, 2)+2*x-3) ;
        } else if (x >2 && x <=10) {
            y = 5*x+7;
            
        } else if ( 3<x || x>10) {
            y=0;
        }
         System.out.printf("X= %f, y = %f" , x , y);  
         // %f = float , double ; %s = string ; %d = int
         // "%" is used on "printf" function for presenting something at a certain way.
    }
    
}
