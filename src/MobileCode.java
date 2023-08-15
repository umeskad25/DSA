import java.util.ArrayList;
import java.util.List;

public class MobileCode {

	public static void main(String[] args) {
		
		
		int friends = 3;
		List<Integer> name1 = new ArrayList<Integer>();
		List<Integer> name2 = new ArrayList<Integer>();
		List<Integer> name3 = new ArrayList<Integer>();
		
		
		List<List<Integer>> f = new ArrayList<List<Integer>>();
		f.add(name1);
		f.add(name2);
		f.add(name3);
		
		name1.add(20);
		name1.add(5);
		name2.add(25);
		name2.add(40);
		name3.add(100);
		
		int sum =0;
		for(int i=0;i<f.size();i++) {
			
			for(int j=0;j<f.get(i).size();j++) {
				sum=sum+f.get(i).get(j);
			}
		}
		
		System.out.println(sum);
		System.out.println(sum/3);
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
