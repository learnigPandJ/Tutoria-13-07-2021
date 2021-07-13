import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Formateodedecimales{

    public static void main(String [] args) {
        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');

        DecimalFormat formato1 = new DecimalFormat("#.00",separador);
        DecimalFormat formato2 = new DecimalFormat("#.##",separador);

        float numero1 = 3.567890f;
        float numero2 = 5.2f;

        System.out.println("Usando el primero formato --> #.00");
        System.out.println(formato1.format(numero1));
        System.out.println(formato1.format(numero2));

        System.out.println("Usando el segundo formato --> #.##");
        System.out.println(formato2.format(numero1));
        System.out.println(formato2.format(numero2));


    }
}