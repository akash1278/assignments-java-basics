import java.util.*;
public class duplicates_count {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values ");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++) {
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
            else{
                hm.put(a[i],hm.get(a[i])+1);
            }
        }
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}