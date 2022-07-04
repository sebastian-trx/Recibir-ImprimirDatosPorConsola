package primerProyectoJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        capturarEImprimirDatos();
    }

    public static void capturarEImprimirDatos(){
        Scanner captura = new Scanner(System.in);
        System.out.println("ingrese su nombre de usuario: ");
        String nombre = captura.nextLine();
        System.out.println("ingrese su numero de celular: ");
        String celular = captura.nextLine();
        System.out.println("ingrese su edad: ");
        String edad = captura.nextLine();
        System.out.println("Bienvenido señor " +(nombre)+ " es un placer para nosotros contar con una persona de " +edad+ " años.");
        System.out.println("Próximamente nos comunicaremos con usted al numero " +celular+ ".");
        System.out.println("Feliz día");
    }
}
