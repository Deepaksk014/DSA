package sortAlgo;

public class bubbleSortAlgo {
    public static void main(String[] args) {
        int[] nums ={6,2,22,9,3,5,4,8,7};
        int size= nums.length;
        int tem=0;
        System.out.println("before sorting");
        for (int n : nums){
            System.out.print(n + " ");
        }

        for (int i=0; i<size;i++){
            for (int j=0;j<size-i-1;j++){
                if (nums[j] > nums[j+1]){
                    tem=nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = tem;
                }
            }
        }
        System.out.println();
            System.out.println("after sorting");
        for (int n : nums){
            System.out.print(n + " ");
        }
    }
}
