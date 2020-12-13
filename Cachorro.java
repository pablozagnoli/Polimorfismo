
package polimorfismo;


public class Cachorro extends Animal{
    
     public void correr(){
        System.out.println("O cachorro correu!!!!");
   
    
}
     
     @Override
      public void emitirSom(){
        System.out.println("au au");
    }
}