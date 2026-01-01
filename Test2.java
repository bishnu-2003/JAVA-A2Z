import java.util.*;

public class Test2 {
  
    public static void main(String[] args) {

List<Integer> arr = new ArrayList<>();

Map<String, Integer> marks = new HashMap<>();
marks.put("alex", 100);
marks.put("brian", 200);

for(Map.Entry<String, Integer> entry : marks.entrySet()){
    System.out.println(entry.getKey());
  System.out.println(entry.getValue());  

    }
}
}

