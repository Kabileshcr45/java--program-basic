import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<String>obj=new ArrayList<>();
	    obj.add("10");
	    obj.add("20");
	    obj.add("30");
		System.out.println(obj);
		obj.remove("30");
		System.out.println(obj);
	}
}