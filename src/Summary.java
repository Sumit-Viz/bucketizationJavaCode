import java.util.HashMap;


public class Summary {
	String bucketName;
	HashMap<String , String> keyvalsMap;
	Summary(String bucketName,HashMap<String, String> keyvalsMap)
	{
		this.bucketName = bucketName;
		this.keyvalsMap = keyvalsMap;
	}
}