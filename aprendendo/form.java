package Java.aprendendo;
import java.util.Scanner;

public class Form{
  public static void main(String[]args){

    Scanner escaneador = new Scanner(System.in);

    System.out.println("Nome: ");
    String nome = escaneador.nextLine();

    System.out.println("Idade: ");
    int idade = escaneador.nextInt();
    escaneador.nextLine();

    System.out.println("Email: ");
    String email = escaneador.nextLine();

    escaneador.close();


    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
     System.out.println("Email: "+email);



  }

}
