import java.util.List;
import java.util.ArrayList;

public class Student {

    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa){
        this.nume=nume;
        this.grupa=grupa;
        this.note=new ArrayList<>();
    }

    public String getNume(){
        return nume;
    }

    public String getGrupa(){
        return grupa;
    }

    public void adaugaNota(int nota){
        this.note.add(nota);
    }

    public List<Integer> getNote(){
        return note;
    }

    public boolean esteIntegralist(){
        for(int nota:note){
            if(nota<5) return false;
        }
        return true;
    }

    public int getNumarRestante(){
        int nr=0;
        for(int nota:note){
            if(nota<5) nr++;
        }
        return nr;
    }

    public double medie(){
        if(note.isEmpty()) return 0.0;
        double suma=0;
        for(int nota:note){
            suma+=nota;
        }
        return suma/note.size();
    }

    @Override
    public String toString(){
        String result = "";
        result += String.format("%-7s", grupa);
        result += String.format(" %-20s", nume);
        result += String.format(" | Note: %-15s", note.toString());
        result += String.format(" | Medie: %4.2f", medie());
        result += String.format(" | Restante: %d", getNumarRestante());
        return result;
    }
}
