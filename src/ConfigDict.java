import java.util.ArrayList;
import java.util.HashMap;


public class ConfigDict {
	String identifier;
	HashMap<String, ArrayList<String>> keyvalsMap;
	ConfigDict(String identifier,HashMap<String, ArrayList<String>> map)
	{
		this.identifier = identifier;
		this.keyvalsMap = map;
	}
}