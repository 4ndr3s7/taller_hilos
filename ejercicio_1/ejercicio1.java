package ejercicio_1; // Declaración del paquete donde se encuentra la clase

// Clase principal que ejecuta los hilos
public class ejercicio1 {
    public static void main(String[] args) {
        // Creamos dos instancias de la clase HiloNumeroLetras
        // h1 imprime números, h2 imprime letras
        HiloNumeroLetras h1 = new HiloNumeroLetras(1);
        HiloNumeroLetras h2 = new HiloNumeroLetras(2);

        // Creamos los objetos Thread y les pasamos los hilos creados
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        // Iniciamos los hilos
        t1.start();
        t2.start();
    }
}
