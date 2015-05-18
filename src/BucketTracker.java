import java.util.ArrayList;
import java.util.HashMap;


public class BucketTracker {
	String bucketno;
	HashMap<String, ArrayList<Double>> colvalsMap;
	BucketTracker(String bucketno,HashMap<String, ArrayList<Double>> colvalsMap)
	{
		this.bucketno = bucketno;
		this.colvalsMap = colvalsMap;
	}
}