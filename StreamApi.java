import java.util.Arrays;
import java.util.List;


public class StreamApi {
	public static void main(String args[])
	{
	List<Integer> nums = Arrays.asList(8,9,3,1,7,0,5);
	                        nums.stream()
	                       .filter(n->n%2==0)
	                       .sorted()
	                       .forEach(n->System.out.println(n));
	List<String> data = Arrays.asList("arul","sukin","mahesh","saraboj");
	                   data.stream()
	                   .filter(n->n.length()>5)
	                   .forEach(n->System.out.println(n));
	                   
	                   
	                   
	
	
	}
}
