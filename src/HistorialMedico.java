import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }
    public void añadirConsulta(Consulta consulta){
        consultas.add(consulta);
    }
   public void eliminarConsulta(Consulta consulta){
        consultas.remove(consulta);
    }
    public void limpiarConsultas() {
        consultas.clear();
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return Collections.unmodifiableList(recetasMedicas);
    }

    public void añadirReceta(RecetaMedica recetaMedica){
        recetasMedicas.add(recetaMedica);
    }
   public void eliminarExamen(RecetaMedica recetaMedic){
        recetasMedicas.remove(recetaMedic);
    }
    public void limpiarExamenesMedicos() {
        recetasMedicas.clear();
    }

}
