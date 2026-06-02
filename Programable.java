
package parcialrubenbadaracco321;


public class EvaluacionFisica extends Actividad implements Informable {
    private static final int MAX_PUNTAJE= 100;
    private static final int MIN_PUNTAJE= 0;
    private int puntaje;

    public EvaluacionFisica(String nombre, String entrenador, NivelIntensidad nivel,int puntaje) {
        super(nombre, entrenador, nivel);
        this.puntaje = puntaje;
    }

    private void validarParametroPuntaje(int puntaje){
        if(puntaje < MIN_PUNTAJE || puntaje > MAX_PUNTAJE){
            throw new IllegalArgumentException("Puntaje Ingresado no es valido");
        }
    }
    
    
    @Override
    public void generarInforme() {
        System.out.println("Informe de evaluacion fisica: " + getNombre() + "Puntaje obtenido: " +puntaje +"/"+ MAX_PUNTAJE);
    }
    @Override
    protected boolean declararInformable(){
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + " puntaje: " + puntaje;
    }

    @Override
     protected boolean declararProgramable(){
         return false;
    }
}
