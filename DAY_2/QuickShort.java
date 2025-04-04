public class QuickShort {
    public static void main(String[] args) {
        int arr[] = {8,3,2,4,6,5,8,0};
        quicksort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }

    public static void quicksort (int arr[] , int si, int ei){
        if(si>ei) return;
        int pi = pivot(arr, si, ei);
        quicksort(arr, si, pi-1);//left side divide
       quicksort(arr, pi+1, ei);//right side divide
    }

    public static int pivot(int arr[],int si,int ei){
        int element = arr[ei];
        int pi =si;
        for(int i=si;i<=ei;i++){
            if(element>arr[i]){
                int temp = arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
