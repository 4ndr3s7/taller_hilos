
package ejercicio_5;

public class Ejercicio_5 {

    public static void main(String[] args) {
        
        int [] numeros = new int [1000];
        
        int s = 0;
        for (int i=0; i < numeros.length; i++) {
            numeros[i] = i;
            s += i;
            
        }
        
        System.out.println((double) s / 1000);
        
        MediaHilo mh1 = new MediaHilo(numeros, 0 , 250);
        MediaHilo mh2 = new MediaHilo(numeros, 250 , 500);
        MediaHilo mh3 = new MediaHilo(numeros, 500 , 750);
        MediaHilo mh4 = new MediaHilo(numeros, 750 , 1000);
        
        mh1.start();
        mh2.start();
        mh3.start();
        mh4.start();
        
        try {
           mh1.join();
           mh2.join();
           mh3.join();
           mh4.join(); 
            
           double r1 = mh1.getResultado();
           double r2 = mh2.getResultado();
           double r3 = mh3.getResultado();
           double r4 = mh4.getResultado();
                   
           double media = (r1+r2+r3+r4) / 4;
           
           System.out.println("Media: " + media);
                    
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
