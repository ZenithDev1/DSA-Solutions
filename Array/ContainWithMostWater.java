// 11 leetcode problem
public int maxArea(int[] height) {
      int max = 0;
      int left = 0;
      int right = height.length -1;
       while(left <= right){
            int h = Math.min(height[left], height[right]);
            int breadth = Math.abs(right - left);
            int area = breadth * h;
            max = Math.max(area, max);
            if(height[left]<= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
