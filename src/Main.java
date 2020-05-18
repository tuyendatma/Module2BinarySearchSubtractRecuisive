public class Main {
    static int[] list= {1,2,3,4,5,6,7,8,9};
    static int binarySearch(int[] list, int num){
        int left =0;
        int right = list.length-1;
        while (right>=left){
            int mid = left+ (right -left)/2;
            if(list[mid] == num){
                return mid;
            }else if(list[mid]>num){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 10));

    }
}
