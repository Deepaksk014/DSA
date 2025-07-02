package searchAlgo;

public class binarySearchAlgo {

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14,16,18,20};
        int target= 14;

        int left=0;
        int right= num.length-1;

        int res= binarySearch(num,target,left,right);

        if(res != -1){
            System.out.println("target found at : " + res);
        }else {
            System.out.println("target not found.");

        }

    }

    public static int binarySearch(int[] num, int target, int left, int right) {


        // O(log n)
        if (left<= right){
            int mid= (left + right) / 2;
            if (num[mid] == target ){
                return mid;
            } else if (num[mid] < target) {
                return binarySearch(num,target,mid+1,right);
            }else {
                return binarySearch(num,target,left,mid-1);
            }
        }

        return -1;
    }
}
