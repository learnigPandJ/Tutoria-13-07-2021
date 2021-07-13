import java.util.Scanner;

public class Lecturadedatos {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Leyendo un entero");
        int numero = Integer.parseInt(lector.nextLine());//numero = int(input("Leyendo un entero"))

        System.out.println("Leyendo un String");
        String nombre = lector.nextLine();

        System.out.println("Leyendo un float");
        float numero3 = Float.parseFloat(lector.nextLine());

        System.out.println("Mostrando datos");
        System.out.println("Numero1: "+numero);
        System.out.println("Numero2: "+nombre);
        System.out.println("Numero3: "+numero3);

        /*System.out.println("Leyendo un entero");
        int numero = lector.nextInt();

        System.out.println("Leyendo un String");
        String nombre = lector.nextLine();//\n

        System.out.println("Leyendo un float");
        float numero3 = lector.nextFloat();

        System.out.println("Mostrando datos");
        System.out.println("Numero1: "+numero);
        System.out.println("Numero2: "+nombre);
        System.out.println("Numero3: "+numero3);*/








        /*System.out.println("Leyendo un entero");
        int numero = lector.nextInt();

        System.out.println("Leyendo otro entero");
        int numero2 = lector.nextInt();

        System.out.println("Leyendo un float");
        float numero3 = lector.nextFloat();

        System.out.println("Mostrando datos");
        System.out.println("Numero1: "+numero);
        System.out.println("Numero2: "+numero2);
        System.out.println("Numero3: "+numero3);*/
    }
}
