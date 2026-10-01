class KthLargest {

    int k;
    List<Integer> list;
    int curKthLargest;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        list.sort(Comparator.naturalOrder());
        curKthLargest = list.size() - k + 1;
    }

    
    public int add(int val) {
        list.add(val);
        list.sort(Comparator.naturalOrder());
        return list.get(curKthLargest++);
    }
}
