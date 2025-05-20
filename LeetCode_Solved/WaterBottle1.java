class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      // 1518 problem leetcode
       int ans = numBottles;
     
     while(numBottles >= numExchange){
         int newBottles = numBottles / numExchange;
         int remBottle = numBottles % numExchange;
         ans = ans + newBottles;
         newBottles = newBottles + remBottle;
     }
     return ans;
    }
}
