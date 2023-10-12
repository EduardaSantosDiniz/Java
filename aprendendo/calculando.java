package Java.aprendendo;
import java.util.Scanner;


public class calculando {
    public static void main(String[]args){
        int numero1;
        int numero2;

        Scanner escaneador = new Scanner(System.in);

        System.out.println("Me diga um numero: ");
        numero1 = escaneador.nextInt();
        
        System.out.println("Me diga outro número: ");
        numero2 = escaneador.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("O resultao é "+resultado);

        escaneador.close();


    }
    
}
