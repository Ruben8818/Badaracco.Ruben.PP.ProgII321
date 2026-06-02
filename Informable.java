
package parcialrubenbadaracco321;


public class ActividadDuplicadaException extends IllegalArgumentException {
    
    private static final String MESSAGE = "La actividad que se desea agregar ya se encuentra ingresada y con un entreandor a cargo";
    
   public ActividadDuplicadaException(){
       super(MESSAGE);
   }
   public ActividadDuplicadaException(String mensaje){
       super(mensaje);
   }
    
}
