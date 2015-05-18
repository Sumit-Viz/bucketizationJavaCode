import java.util.Comparator;

public class ClickComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] o1, String[] o2) {
    	double d1 = ((Double.parseDouble(o1[3])/(Double.parseDouble(o1[3]) + Double.parseDouble(o1[4]))));
    	//String d1str = String.valueOf(d1);
    	double d2 = ((Double.parseDouble(o2[3])/(Double.parseDouble(o2[3]) + Double.parseDouble(o2[4]))));
    	//String d2str = String.valueOf(d2);
        return d1 < d2 ? -1 : 1;
    }
}