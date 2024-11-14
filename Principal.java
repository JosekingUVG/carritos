import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        BMWClaseC carro = new Carrito();
        Scanner scanner = new Scanner(System.in);
        boolean encender = true;
        boolean ventilacionAutomatica = false;
        boolean modoSilencioso = false;
        int proximoMantenimiento = 0;
        
        System.out.println("SISTEMA DE CLIMATIZACIÓN");
        System.out.println("iniciar programa");
        while (encender==true) {
            System.out.println("Escoja una opción:\n1. Encender o apagar\n2. Aumentar temperatura\n3. Disminuir temperatura\n4. Modo automático\n5. Nivel de ventilación\n6. Ventilación automática limitada\n7. Ventilación a zona específica\n8. Modo silencioso\n9. Calefacción rápida\n10. Distribución de aire\n11. Desempañador\n12. Personalizar niveles de humedad\n13. Indicador de humedad\n14. Historial de mantenimiento\n15. Programar mantenimiento\n16. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    encender = !encender;
                    break;
                case 2:
                    if (ventilacionAutomatica){
                        System.out.println("No se puede modificar la temperatura. Ventilación automática activada.");
                    }
                    else{
                        float temp = carro.mostrarTemp();
                        temp += 1;
                        carro.pedirTemperatura(temp);
                    }
                    break;
                case 3:
                    if (ventilacionAutomatica){
                        System.out.println("No se puede modificar la temperatura. Ventilación automática activada.");
                    }
                    else{
                        float temp = carro.mostrarTemp();
                        temp -= 1;
                        carro.pedirTemperatura(temp);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la temperatura exterior:");
                    float tempExt = scanner.nextFloat();
                    scanner.nextLine();
                    if (tempExt > 20){
                        carro.pedirTemperatura(15);
                    }
                    else{
                        carro.pedirTemperatura(20);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nivel de ventilación (bajo, medio, alto):");
                    String nivelVentilacion = scanner.nextLine();
                    carro.pedirNivelVentilacion(nivelVentilacion);
                    break;
                case 6:
                    ventilacionAutomatica = !ventilacionAutomatica;
                    break;
                case 7:
                    System.out.println("Ingrese la zona de ventilación (parabrisas, frontal, pies)");
                    String zonaVentilacion = scanner.nextLine();
                    carro.pedirZonaVentilacion(zonaVentilacion);
                    break;
                case 8:
                    modoSilencioso = !modoSilencioso;
                    break;
                case 9:
                    System.out.println("Calefacción rápida activada.");
                    carro.pedirTemperatura(25);
                    System.out.println("Calentando...");
                    carro.pedirTemperatura(20);
                    System.out.println("Calentado.");
                    break;
                case 10:
                    System.out.println("Ingrese la zona de ventilación (parabrisas, frontal, pies)");
                    zonaVentilacion = scanner.nextLine();
                    carro.pedirZonaVentilacion(zonaVentilacion);
                    break;
                case 11:
                    carro.mostrarDesempañador();
                    break;
                case 12:
                    System.out.println("Ingrese el nivel de humedad (bajo, medio, alto):");
                    String nivelHumedad = scanner.nextLine();
                    carro.pedirNivelHumedad(nivelHumedad);
                    break;
                case 13:
                    carro.mostrarHumedad();
                    break;
                case 14:
                    System.out.println("Historial de mantenimiento");
                    System.out.println("Se realizará mantenimiento en " + proximoMantenimiento + " meses.");
                    break;
                case 15:
                    System.out.println("Programar mantenimiento\nIngrese en cuántos meses hará un mantenimiento:");
                    proximoMantenimiento = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 16:
                    encender = false;
                    break;
            
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        }
        System.out.println("Gracias por utilizar este programa...");
    }
}