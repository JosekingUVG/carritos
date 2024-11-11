
public class Principal{
    public static void main(String[] args) {
        BMWClaseC carro = new Carrito();
        boolean encender = true;
        
        System.out.println("SISTEMA DE CLIMATIZACIÓN");
        System.out.println("iniciar programa");
        while (encender==true) {
            carro.mostrarMenu();
            int opcion = carro.obtenerOpcionMenu();

        }
        System.out.println("Gracias por utilizar este programa...");
    }
}