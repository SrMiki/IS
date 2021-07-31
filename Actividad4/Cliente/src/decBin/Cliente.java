package decBin;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        
        
        System.out.println("Introduzca una opción: ");
        Scanner teclado = new Scanner(System.in);
        NewJerseyClient CNJ= new NewJerseyClient();
        int n = teclado.nextInt();
        int num = 0;
        while(n != 0){
            
            n = teclado.nextInt();
            if(n==1){
                System.out.println("Introduzca un numero: ");
                num = teclado.nextInt();
                System.out.println(CNJ.putXml(num+"", String.class));
            } else if (n == 2){
                System.out.println("Introduzca un numero: ");
                num = teclado.nextInt();
                System.out.println(factorial(num));
            }
            

        }
    }

    private static int factorial(double num) {
        factorial.WSFactorial_Service service = new factorial.WSFactorial_Service();
        factorial.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(num);
    }
    
}
