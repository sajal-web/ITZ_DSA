// package Arrays;

public class ArrayCC {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 15;
        System.out.print(linearSearch(numbers,key));
    }
    static int linearSearch(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i ;
            }
        }
        return -1;
    }
}
