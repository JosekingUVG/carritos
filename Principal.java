import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        BMWClaseC carro = new Carrito();
        Scanner scanner = new Scanner(System.in);
        boolean encender = true;
        
        System.out.println("SISTEMA DE CLIMATIZACIÓN");
        System.out.println("iniciar programa");
        while (encender==true) {
            System.out.println("Escoja una opción:\n1. Encender o apagar\n2. Ajustar temperatura\n3. Modo automático\n4. Nivel de ventilación\n5. Ventilación automática limitada\n6. Ventilación a zona específica\n7. Modo silencioso\n8. Calefacción rápida\n9. Distribución de aire\n10. Desempañador\n11. Personalizar niveles de humedad\n12. Indicador de humedad\n13. Historial de mantenimiento\n14. Programar mantenimiento");
            int opcion = scanner.nextInt();
            scanner.nextLine();

        }
        System.out.println("Gracias por utilizar este programa...");
    }
}