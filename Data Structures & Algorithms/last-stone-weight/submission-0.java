class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            p.add(i);
        }
        while(p.size() > 1){
            int first = p.poll();
            int second = p.poll();
            if(first != second){
                p.add(Math.abs(first - second));
            }
        }
        return p.isEmpty() ? 0 : p.poll();
    }
}
