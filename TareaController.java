import java.util.ArrayList;
import java.util.List;

public class TareaController {
    
    //atributos

    private List<Tarea> listaDeTareas = new ArrayList<Tarea>(); 

    private int contadorTareas;

    public TareaController(){
        contadorTareas = 0;
    }

    public Tarea agregarTarea(String titulo, String descripcion) {
        Tarea nueva = new Tarea(contadorTareas++, titulo, descripcion);
        listaDeTareas.add(nueva);
        return nueva;
    }

    public void completarTarea(int id) {
        if (id >= contadorTareas){
            throw new IllegalArgumentException("No hay una tarea con el ID: " + id);
        }
        for (Tarea t : listaDeTareas) {
            if (t.getId() == id) {
                if (t.getCompletada()) {
                    throw new IllegalStateException("La tarea ya estaba completada.");
                }
                t.setCompletada(true);
            }
        }
        
    }

    public void tareaReloj(){
        System.out.println("------------------------------------------");
        System.out.println("*                                         *");
        System.out.println("*                 10:30 AM                *");
        System.out.println("*                                         *");
        System.out.println("------------------------------------------");
    }

    public void tareaClima(){
        System.out.println("------------------------------------------");
        System.out.println("*                                         *");
        System.out.println("*               Guatemala                 *");
        System.out.println("*                  21°                    *");
        System.out.println("*               Pronostico                *");
        System.out.println("*              ↑ 26°  ↓ 16°               *");   
        System.out.println("*                                         *");
        System.out.println("------------------------------------------");
    }

    public void tareaFrase(){
        System.out.println("------------------------------------------");
        System.out.println("*                                         *");
        System.out.println("*         El imposible no existe          *");
        System.out.println("*         Para aquel que insiste          *");
        System.out.println("*                                         *");
        System.out.println("------------------------------------------");
    }
}
