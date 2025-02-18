package sortAlgo;

public class quickSortAlgo {

    public static void main(String[] args) {
        int[] arr={6,2,22,9,3,5,4,8,7};

        quickSort(arr,0,arr.length-1);

        for(int num : arr){
            System.out.print(num+ " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low < high){
            int pi = findPivot(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }



    }

    private static int findPivot(int[] arr, int low, int high) {

        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){

            if(arr[j]<pivot){
                i++;
                int tem = arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
        }
        int tem =arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=tem;

        return i+1;
    }


}
