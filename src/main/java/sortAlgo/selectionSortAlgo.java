package sortAlgo;

public class selectionSortAlgo {

    public static void main(String[] args) {
        int[] nums ={6,2,22,9,3,5,4,8,7};
        int size= nums.length;
        int tem=0;
        int minIndex = -1;
        System.out.println("before sorting");
        for (int n : nums){
            System.out.print(n + " ");
        }

        for (int i=0;i<size-1;i++){

            minIndex=i;
            for(int j=i+1; j<size;j++){

                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }

            tem=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=tem;
        }
        System.out.println();
        System.out.println("after sorting");
        for (int n : nums){
            System.out.print(n + " ");
        }
    }
}
