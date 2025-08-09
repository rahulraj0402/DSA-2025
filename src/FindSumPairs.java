import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {

    private ArrayList<Integer> nums1;
    private ArrayList<Integer> nums2;

    private Map<Integer,Integer> frequencyMap;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = new ArrayList<>();
        for (int num : nums1){
            this.nums1.add(num);
        }

        this.nums2 = new ArrayList<>();
        for (int num : nums2){
            this.nums2.add(num);
        }

        frequencyMap = new HashMap<>();
        for (int num : nums2){
            frequencyMap.put(num , frequencyMap.getOrDefault(num , 0) + 1);
        }

    }

    public void add(int index, int val) {
        int oldValue = nums2.get(index);
        frequencyMap.put(oldValue , frequencyMap.get(oldValue) - 1);
        if (frequencyMap.get(oldValue) == 0){
            frequencyMap.remove(oldValue);
        }

        int newValue = oldValue + val;
        nums2.set(index , newValue);
        frequencyMap.put(newValue , frequencyMap.getOrDefault(newValue , 0) + 1);
    }

    public int count(int tot) {
        int count = 0 ;
        for (int num : nums1){
            int complement = tot - num;
            count += frequencyMap.getOrDefault(complement , 0);
        }

        return count;
    }
}