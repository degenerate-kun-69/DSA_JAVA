public class sorting {
    public static void main(String[] args) {
        int[] arr= {12, 3, 45, 2, 13};
        int i=0;
        while(i<arr.length){
           // System.out.println(bubbleSortAsc(arr)[i]);
            System.out.println(bubbleSortDesc(arr)[i]);
        i++;
        }
    }
    static int[] bubbleSortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] bubbleSortDesc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] selectSortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    static int[] selectSortDesc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int largest=i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[largest]<arr[j])
                    largest=j;
            }
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    static int[] insertSortAsc(int[] arr){
        for (int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
//    static int[] insertSortDesc(int[] arr){
//        for (int i=1;i<arr.length;i++){
//            int current = arr[i];
//            int j=i-1;
//            while (j>=0 && current<arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=current;
//        }
//        return arr;
//    }
}
