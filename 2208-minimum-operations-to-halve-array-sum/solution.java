// Minimum Operations to Halve Array Sum
// Difficulty: Medium
// Runtime: 290 ms
// Memory: 103.4 MB
// https://leetcode.com/problems/minimum-operations-to-halve-array-sum/

class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> newlist = new PriorityQueue<>(Collections.reverseOrder());

        double sum = 0;

        for(int num : nums){
            sum += num;
            newlist.add((double)num);
        }
        double target = sum /2;
        int operations = 0;
        double total = 0;

        while(total < target){
            double max = newlist.poll();
            double halfvalue = max/2;
