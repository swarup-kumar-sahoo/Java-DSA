public class ContainerMostWater {
    public static int findArea(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){

            int w = right - left;
            int area = Math.min(height[left], height[right]) * w;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println("The area is : " + findArea(height));
    }
}