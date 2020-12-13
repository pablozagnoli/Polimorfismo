
package polimorfismo;

public class Gato extends Animal {

        public void correr(){
        	System.out.println("O gato correu!!!!");
    	   }

   @Override 
     public void emitirSom(){
        System.out.println("miau");
    }
        
}
