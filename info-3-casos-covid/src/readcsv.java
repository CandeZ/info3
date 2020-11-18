
/*import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;*/
import java.util.Scanner;

public class readcsv {
    public static void main(String[] args) throws Exception {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese codigo de dato que desea visualizar");
            System.out.println("1) Cantidad total de muestras");
            System.out.println("2) Cantidad total de infectados");
            System.out.println("2) Cantidad de fallecidos");
            System.out.println("3) % de infectado por muestras");
            System.out.println("4) Cantidad de infectados por rango etario ( rango de 10 años)");
            System.out.println("5) Cantidad de muertes por rango etario ( rango de 10 años)");
            System.out.println("6) Cerrar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite un caracter: ");
                    // dato = scanner.nextLine();
                    break;

                case 6:
                    break;
            }
        } while (opcion != 6);
    }
}
/*Información estadística:
• Cantidad total de muestras
• Cantidad total de infectados
• Cantidad de fallecidos
• % de infectado por muestras
• % de fallecidos por infectados
• Cantidad de infectados por rango etario ( rango de 10 años)
• Cantidad de muertes por rango etario ( rango de 10 años)*/