     package common;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author son
 */
public class ALgorithm {
    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
     public int partition(int[] array, int left, int right) {
      
//        int i = left, j = right;
//        int middle = array[(left + right) / 2];
//        int tmp;
//        while (i <= j) {
//            while (array[i] < middle) {
//                i++;
//            }
//            while (array[j] > middle) {
//                j--;
//            }
//            if (i <= j) {
//                tmp = array[i];
//                array[i] = array[j];
//                array[j] = tmp;
//                i++;
//                j--;
//            }
//        };
//         tìm vị trí của pivot
        int pivot= array[right];
        int i= left - 1;
        for(int j=left ;j<right;j++){
            if(array[j]<pivot){
                i++;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        ++i;
        int teap= array[i];
        array[i]=array[right];
        array[right]=teap;
        return i;
    }
    public void quickSort(int[] array, int left, int right) {
//        int index = partition(array, left, right);
//        if (left < index - 1) {
//            quickSort(array, left, index - 1);
//        }
//        if (index < right) {
//            quickSort(array, index, right);
//        }
       if(left>right) return;
       int p = partition(array, left, right);
        quickSort(array, left, p-1);
        quickSort(array, p+1, right);
    }
    public int linearSearch(int[] array, int k){
        for(int i = 0; i < array.length; i++)
        if (array[i] == k)
            return i;
        // Trả về -1 nếu đã duyệt hết mà ko tìm thấy.
    return -1;
    }
     public int binarySearch(int[] array, int value, int left, int right){
        // value là giá trị muốn tìm kiếm 
        // là một mảng đã sắp xếp
        if(left>right)
            return -1;
        int middle= (right+left)/2;
        if(array[middle]==value)
            return middle;
        else if(middle>value){
            return binarySearch(array, value, left, middle);// hoặc middle-1.
        }
        else 
            return binarySearch(array, value, middle, right);// hoặc middle +1.
    }
     public void display(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            if(i<arrays.length-1)
                System.out.print(arrays[i]+" , ");
            else
                System.out.println(arrays[i]);
        }
    }
}
