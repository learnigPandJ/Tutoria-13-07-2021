import java.util.Scanner;

public class Estructuraswitch {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = lector.nextInt();

        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("No se encuentra la traducción del número ");
        }

        /*if( num == 1){
            System.out.println("One");
        }else if(num == 2){
            System.out.println("Two");
        }else if(num == 3){
            System.out.println("Three");
        }else if(num == 4){
            System.out.println("Four");
        }else if(num == 5){
            System.out.println("Five");
        }else{
            System.out.println("No se encuentra la traducción del número ");
        }*/
     }
}
