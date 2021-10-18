
/* Intiution: 1.We need to have a count of every string(Can be done using HashMap)
2.Also,we need to map count to Strings(Can be multiple,like ex-1),So again HashMap<Integer,List> can be used.
3.But, If we have multiple string having same count,we need to return it lexographically.(Rather than sorting all lists ,lets sort only the list which is required in the result ).
*/
import java.util.*;

public class Frequency {
    public static void topKFrequent(String words[], int k) {
        // List for storing result
        ArrayList<String> result = new ArrayList<String>();
        // Mapping string with count
        HashMap<String, Integer> hm = new HashMap<>();
        // Mapping count with list of string
        HashMap<Integer, List<String>> cq = new HashMap<>();
        // Keeping track of highest count ,Since we need to start from the top
        int max = 0;
        // Creating HashMap for count of every string
        for (String s : words) {
            int temp = hm.getOrDefault(s, 0);
            hm.put(s, temp + 1);
        }
        int value;
        // Iterating hm Hashmap for generating count-List<String> pair
        for (String s : hm.keySet()) {
            value = hm.get(s);
            // updating highest count
            max = Math.max(max, value);
            if (!cq.containsKey(value))
                cq.put(value, new ArrayList<String>());
            cq.get(value).add(s);
        }
        // Keep decrementing max value by 1,untill either k is reached 0 or no pair in
        // hashmap is left
        while (k > 0 && max > 0) {
            if (cq.containsKey(max)) {
                List<String> temp = cq.get(max);
                // Needs a sorted list of sorting temp list
                Collections.sort(temp);
                // If list is bigger than requirement,we take everything
                if (temp.size() <= k) {
                    result.addAll(temp);
                }
                // take only k elements from temp list
                else {
                    for (int i = 0; i < k; i++) {
                        result.add(temp.get(i));
                    }
                }
                // reducing k's value from temp size
                k -= temp.size();
            }
            // Reducing max size to check for max-1 count in teh cq HashMap
            max--;
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // ArrayList<String> arr = new ArrayList<String>();
        int n;
        n = input.nextInt();
        String arr[] = new String[n];
        /*
         * String n; while (input.hasNext()) { n = input.next(); arr.add(n); }
         */
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        int k = input.nextInt();
        input.close();
        topKFrequent(arr, k);
    }
}