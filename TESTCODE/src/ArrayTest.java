import java.util.ArrayList;
import java.util.List;


public class ArrayTest {
	public static void main(String[] args) {
		List<String> aa = new ArrayList<String>();
		List<String> bb = new ArrayList<String>();
		aa.add("A1");
		aa.add("A2");
		aa.add("A3");
		aa.add("A4");
		aa.add("A5");
		
		bb.add("A1");
		bb.add("A2");
		
		for(int i=0 ;i<aa.size(); i++) {
			for(int k=0 ;k<bb.size(); k++) {
				if(aa.get(i).equals(bb.get(k))) {
					System.out.println("-------------i:"+i+":K:"+k);
					bb.remove(k);
					aa.remove(i--);
					break;
				}
				
			}
		}
		
		for(int i=0 ;i<aa.size(); i++) {
			System.out.println(i+"---"+aa.get(i));
		}
		
		for(int i=0 ;i<bb.size(); i++) {
			System.out.println(i+"---"+bb.get(i));
		}
		
	}
}
