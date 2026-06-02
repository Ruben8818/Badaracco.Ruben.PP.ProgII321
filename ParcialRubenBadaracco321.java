
package parcialrubenbadaracco321;


public class ClaseGrupal extends Actividad implements Programable {
    private int cantidadMaximaAlumnos;
    

    public ClaseGrupal( String nombre, String entrenador, NivelIntensidad nivel,int cantidadMaximaAlumnos) {
        super(nombre, entrenador, nivel);
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
    }

    public int getCantidadMaximaAlumnos() {
        return cantidadMaximaAlumnos;
    }

    @Override
    public void programar() {
        System.out.println("Se programo la clase grupal: " + getNombre());
    }
    @Override
    protected boolean declararProgramable(){
            return true;
    }
    @Override
    protected boolean declararInformable(){
            return false;
    }
    
    @Override
    public String toString(){
        return super.toString() + " ,cantidad maxima alumnos: " + cantidadMaximaAlumnos;
    }

   
    
}
