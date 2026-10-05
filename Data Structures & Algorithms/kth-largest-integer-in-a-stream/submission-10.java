class KthLargest {

    PriorityQueue<Integer> minHeap;
    int wanted;


    public KthLargest(int k, int[] nums) {
        this.wanted = k;
        this.minHeap = new PriorityQueue<>();
        for (int i : nums) {
            add(i);
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
