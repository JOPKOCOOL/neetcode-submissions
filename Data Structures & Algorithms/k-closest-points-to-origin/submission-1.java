class Solution {

    private PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1, p2) -> Integer.compare(
        getDistanceSquared(p2), getDistanceSquared(p1)));

    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        for (int[] i : points) {
            maxHeap.offer(i);
            if (maxHeap.size() > k) {
             maxHeap.poll();
        }
        }
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i] = maxHeap.poll();
            i++;
        }
        return result;
    }



    private int getDistanceSquared(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
