import java.util.Comparator;

public class AlphabeticalByGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        int groupCompare=o1.getGrupa().compareTo(o2.getGrupa());
        if(groupCompare!=0){
            return groupCompare;
        }
        return o1.getNume().compareTo(o2.getNume());
    }
}
