// package Arrays;

public class ArrayCC {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 15;
        System.out.println(linearSearch(numbers,key));
        System.out.println(getLargestNumber(numbers));
        System.out.println(getSmallestNumber(numbers));
    }
    static int linearSearch(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i ;
            }
        }
        return -1;
    }

    static int getLargestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    static int getSmallestNumber(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
