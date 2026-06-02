
package parcialrubenbadaracco321;

import java.util.ArrayList;


public class CentroEntrenamiento {
    private String nombre;
    private ArrayList<Actividad> actividades;

    public CentroEntrenamiento(String nombre) {
        this.nombre = nombre;
        this.actividades = new ArrayList<>();
    }
    
    public void agregarActividad(Actividad actividad){
        validarActividad(actividad);
        actividades.add(actividad);
        
    }
    
    private void validarActividad(Actividad actividad){
        if(actividad == null || actividades.contains(actividad)){
            throw new ActividadDuplicadaException();
        }
    }
    
    private static void mostrarActividades(ArrayList<Actividad> actividades){
        System.out.println(actividades);
        
    }
    
    public ArrayList<Actividad> obtenerActividades(){
        ArrayList<Actividad> listaParaMostrar = new ArrayList<>();
        for(Actividad a : actividades){
            listaParaMostrar.add(a);
        }
        return listaParaMostrar;
    }
    
    private static void programarActividades(ArrayList<Actividad> actividades ){
            for(Actividad a : actividades){
                if(a.declararProgramable() == true){
                    Programable d = (Programable) a;
                    d.programar();
                } System.out.println("La actividad: " + a.getNombre() +" no puede ser programada");   
        }
    }
    
    private static void generarInformeDesdeMain(ArrayList<Actividad> actividades){
        for(Actividad a : actividades){
                if(a.declararInformable() == true ){
                    Informable d = (Informable) a;
                    d.generarInforme();
                } System.out.println("La actividad: " + a.getNombre() + " no puede ser informada");
           
            
        }
    }
    
    public ArrayList<Actividad> filtrarPorNivel(NivelIntensidad nivel){
        ArrayList<Actividad> listaPorTipo = new ArrayList<>();
        for(Actividad a : actividades){
            if(a.getNivel() == nivel){
                listaPorTipo.add(a);
            }
        }
        return listaPorTipo;
        
    }
    
}
