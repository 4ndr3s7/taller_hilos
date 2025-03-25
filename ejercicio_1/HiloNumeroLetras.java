package ejercicio_1; // Declaración del paquete donde se encuentra la clase

// Implementamos la interfaz Runnable para crear un hilo
public class HiloNumeroLetras implements Runnable {

    private int tipo; // Atributo que indica si el hilo imprimirá números o letras

    // Constructor que recibe el tipo de hilo
    public HiloNumeroLetras(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        while (true) {  // Bucle infinito para imprimir números o letras sin detenerse
            switch (tipo) {
                case 1:
                    // Imprime números del 1 al 29
                    for (int i = 1; i < 30; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    // Imprime letras desde 'a' hasta 'y' (Error: No incluye 'z')
                    for (char c = 'a'; c < 'z'; c++) {
                        System.out.println(c);
                    }
                    break;
            }
        }
    }
}
