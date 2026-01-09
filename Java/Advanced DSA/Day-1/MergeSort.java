

public class MergeSort {
   

   public static void MergeSort(int[] arr, int l, int r) {
      if (l < r) {
         int mid = l + (r - l) / 2;
         MergeSort(arr, l, mid);
         MergeSort(arr, mid + 1, r);
      }
   }
   public static void main(String[] args) {

      int arr[] = { 5,4,6,3 };
      MergeSort(arr, 0, arr.length - 1);
      for (int num : arr) {
         System.out.print(num + " ");
      }
   }
}
