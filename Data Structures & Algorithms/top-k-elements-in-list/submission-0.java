

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr = new int[k];

        // Step 2: Repeat k times
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int element = 0;

            // Step 3: Find max frequency element
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            // Step 4: Store result
            arr[i] = element;

            // Step 5: Remove from map
            map.remove(element);
        }

        return arr;
    }
}