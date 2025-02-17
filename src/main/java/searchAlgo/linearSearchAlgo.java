package searchAlgo;

public class linearSearchAlgo {

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14,16,18,20};
        int target= 14;

        int res= linerSearch(num,target);

        if(res != -1){
            System.out.println("target found at : " + res);
        }else {
            System.out.println("target not found.");

        }
    }

    public static int linerSearch(int[] num, int target) {

        // O(n)
        for(int i=0;i<num.length; i++){
            if (num[i] == target){
                return i;
            }
        }
        return -1;
    }
}
