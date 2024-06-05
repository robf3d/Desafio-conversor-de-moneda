import java.lang.annotation.Target;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 9){
            String base = "";
            String target = "";
            Monedas monedas;

            System.out.println("""
                **********Elija la opcion deseada**********
                1 - Dollar USA a Peso argentino
                2 - Dollar USA a Boliviano boliviano
                3 - Dollar USA a Peso chileno
                4 - Dollar USA a Real brasileño
                5 - Dollar USA a Peso colombiano
                9 - Salir
                *******************************************
                """);

            opcion=teclado.nextInt();

            System.out.println("Cantidad de dollares a transformar");
            int cantidad = teclado.nextInt();

            switch (opcion){
                case 1 :
                    base = "USD";
                    target="ARS";
                    break;

                case 2:
                    base = "USD";
                    target="BOB";
                    break;

                case 3:
                    base = "USD";
                    target="CLP";
                    break;

                case 4:
                    base = "USD";
                    target="BLP";
                    break;
                case 5:
                    base = "USD";
                    target="COP";
                    break;
            }

            try{
                monedas = conversor.convertirMonedas(base,target,cantidad);
                System.out.println("\n" + "***** "+ cantidad + " " + base +" son "+ monedas.conversion_result () + " " + target + " *****" +"\n");
            }catch (Exception e){
                System.out.println("\n"+"!ERROR¡ verifica que tu seleccion sea correcta" +"\n");
            }
        }
    }
}
