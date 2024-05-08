import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

//https://v6.exchangerate-api.com/v6/5c986f71d75f98ace2315d91/latest/USD
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsumoApi api = new ConsumoApi();
        Gson gson = new Gson();
        String json = api.getData();
        Conversor conver = gson.fromJson(json, Conversor.class);
        Scanner sc= new Scanner(System.in);

        String tipoMoneda;
        boolean menu = true;
        int opcion=0;
        double cantidadDeseada;

        while (menu) {
            System.out.println("*****************************************");
            System.out.println("Sea bienvenido/a al conversor de moneda");
            System.out.println("1. Dólar => Peso argentino\n2. Peso argentio => Dólar\n3. Dólar = > Real Brasileño" +
                    "\n4. Real Brasileño => Dólar\n5. Dólar => Quetzales \n6. Quetzales => Dólar" +
                    "\n7. Salir");
            System.out.println("Seleccione una opcion");
            System.out.println("*****************************************");
            try {
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        tipoMoneda="ARS";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.convertirDolares(tipoMoneda,cantidadDeseada));
                        break;
                    case 2:
                        tipoMoneda="ARS";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.otraMoneda(tipoMoneda,cantidadDeseada));
                        break;
                    case 3:
                        tipoMoneda="BRL";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.convertirDolares(tipoMoneda,cantidadDeseada));
                        break;
                    case 4:
                        tipoMoneda="BRL";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.otraMoneda(tipoMoneda,cantidadDeseada));
                        break;
                    case 5:
                        tipoMoneda="GTQ";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.convertirDolares(tipoMoneda,cantidadDeseada));
                        break;
                    case 6:
                        tipoMoneda="GTQ";
                        System.out.println("Ingresa el valor que quieres convertir");
                        cantidadDeseada=sc.nextDouble();
                        System.out.println(conver.otraMoneda(tipoMoneda,cantidadDeseada));
                        break;
                    case 7:
                        menu=false;
                }
            }catch (Exception e){
                System.out.println("Opcion inválida");
                menu=false;
            }
        }
    }
}