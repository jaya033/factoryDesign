
/*this is the operating class that determines which classes' object to be created according the keyword demand
 */

package factoryDesign;

public class OperatingSystemFactory {
	public OS getInstance(String s)
	{
		if(s.equals("opensource"))
			return new Android();
		else if(s.equals("antihack"))
				return new iOS();
		else
			return new Windows();
	}
}
