class KthLargest {

    PriorityQueue<Integer> minHeap;
    int wanted;


    public KthLargest(int k, int[] nums) {
        this.wanted = k;
        this.minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
            if (i >= wanted) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > wanted) {
            minHeap.poll();
        }
        return minHeap.peek();
    }   
}
