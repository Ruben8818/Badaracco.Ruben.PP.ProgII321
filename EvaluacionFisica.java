
package parcialrubenbadaracco321;


import java.util.Objects;
 


public abstract class Actividad {
    private String nombre;
    private String entrenador;
    private NivelIntensidad nivel;
    
    public Actividad(String nombre, String entrenador, NivelIntensidad nivel) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.nivel = nivel;
    }
    
    @Override
    public String toString(){
        String[] x = getClass().getName().split("\\.");
        String clase = x[x.length - 1];
        return clase + "{" + " nombre: " + nombre + " ,entrenador: " + entrenador + " ,nivelIntensidad" + nivel ;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null || !(o instanceof Actividad a)){
            return false;
        }
        return nombre.equals(a.nombre) &&
                entrenador.equals(a.entrenador);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre, entrenador);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public NivelIntensidad getNivel() {
        return nivel;
    }
    
     protected abstract boolean declararProgramable();
          
    protected abstract boolean declararInformable();
          
    
}
