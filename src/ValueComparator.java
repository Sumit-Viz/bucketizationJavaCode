import java.util.Comparator;

public class ValueComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] o1, String[] o2) {
        return Double.parseDouble(o1[2]) < Double.parseDouble(o2[2]) ? -1 : 1; 
    }
}