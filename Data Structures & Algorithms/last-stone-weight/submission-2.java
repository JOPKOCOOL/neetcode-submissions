class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public int lastStoneWeight(int[] stones) {
        for (int i : stones) {
            maxHeap.offer(i);
        }
        while(maxHeap.size() > 1) {
            int max1 = maxHeap.poll();
            int max2 = maxHeap.poll();
            if (max1 == max2) {
                continue;
            }
            if (max1 > max2) {
                maxHeap.offer(max1 - max2);
            }
            else {
                maxHeap.offer(max2 - max1);
            }
        }
        if (maxHeap.isEmpty()) {
            return 0;
        }
        return maxHeap.poll();
    }
}
