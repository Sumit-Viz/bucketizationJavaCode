import java.util.Comparator;

public class BTComparator implements Comparator<BucketTracker> {
    @Override
    public int compare(BucketTracker o1, BucketTracker o2) {
        return Integer.parseInt(o1.bucketno) < Integer.parseInt(o2.bucketno)? -1 : 1;
    }
}