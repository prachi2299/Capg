package p6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {
public List<Integer> getValues(Map<Integer, Integer> map){
    List<Integer> list = new ArrayList<>();

	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        list.add(entry.getValue());
    }
    Collections.sort(list);
	return list;
    
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
		SortHashMap shm=new SortHashMap();
         map.put(1,67);
         map.put(2,79);
         map.put(3,23);
         map.put(4,88);
         map.put(5,11);
         map.put(6,9);
         map.put(7,56);

      List<Integer> newlist = shm.getValues(map); 
         
         for (Integer int3 : newlist) {
        	 System.out.println(int3);
         }
	}

}
