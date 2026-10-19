import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class mainLab2 {
    public static void main(String[] args) {
        Random rand=new Random();

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu Marian", "225_3"));
        studenti.add(new Student("Popescu Maria", "225_3"));
        studenti.add(new Student("Popa Marian", "225_3"));
        studenti.add(new Student("Bica Irina", "225_3"));
        studenti.add(new Student("Badea Ion", "225_1"));
        studenti.add(new Student("Cacoveanu Andreea", "225_1"));
        studenti.add(new Student("Onofrei Mircea", "225_1"));

        //a
        for (Student s:studenti){
            for(int i=0;i<5;i++){
                int notaAleatorie=4+rand.nextInt(7);
                s.adaugaNota(notaAleatorie);
            }
        }

        //b1
        System.out.println("\nOrdonare alfabetica pe grupe\n");
        Collections.sort(studenti,new AlphabeticalByGroupComparator());
        for(Student s:studenti){
            System.out.println(s);
        }

        List<Student>integralisti=new ArrayList<>();
        List<Student>restantieri=new ArrayList<>();

        for(Student s:studenti){
            if(s.esteIntegralist()){
                integralisti.add(s);
            }
            else{
                restantieri.add(s);
            }
        }

        //b2
        System.out.println("\nIntegralisti- ordine descrescatoare medii\n");
        Collections.sort(integralisti,new ByGradesComparator());
        if(integralisti.isEmpty()){
            System.out.println("Nu exista studenti integralisti!");
        }
        else{
            for(Student s:integralisti){
                System.out.println(s);
            }
        }

        //b3
        System.out.println("\nRestantieri ordonati crescator dupa numarul de restante");
        Collections.sort(restantieri, new ByRestanteComparator());
        if (restantieri.isEmpty()) {
            System.out.println("Nu exista niciun student restantier.");
        } else {
            for (Student s : restantieri) {
                System.out.println(s);
            }
        }

    }
}
