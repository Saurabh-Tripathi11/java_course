
import java.util.*;


public class Test{
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        Map<String,Integer> marks=new HashMap<>();
        marks.put("Saurabh", 100);
        marks.put("Sachin", 0);

        for(Map.Entry<String,Integer> entry:marks.entrySet()){
            System.out.print(entry.getKey()+"-----");
            System.out.println(entry.getValue());
            System.out.println("-----");
        }
    }

}