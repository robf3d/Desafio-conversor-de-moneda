import java.lang.annotation.Target;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 9){
            String base;
            String target;

            System.out.println("""
                *****Elija la opcion deseada*****
                1 - Dollar USA a Euro
                9 - Salir
                """);
            opcion=teclado.nextInt();
            
            Monedas monedas;
            switch (opcion){
                case 1:
                    base = "USD";
                    target="EUR";
                    monedas = conversor.convertirMonedas(base,target);
                    System.out.println(monedas.conversion_result());
                    break;

                case 2:
                    base = "GBP";
                    target="EUR";
                    monedas = conversor.convertirMonedas(base,target);
                    System.out.println(monedas.conversion_result());
                    break;

            }
        }
    }
}
