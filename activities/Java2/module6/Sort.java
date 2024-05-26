import java.util.Arrays;
import java.util.Random;

public class Sort {

    // less efficient execution time
    // exhibits quadratic growth
    // will loop as many times as there are characters in an array
    // does a comparison on every item, loop within a loop
    /* minIndex is the index that currently holds the lowest value
     * in the first iteration minIndex is 0, then comparisons start
     * is index 1 < index 0 (so is 9 < 3) no, so minIndex stays at 0
     * ... at index 3, is index 3 < index 0 (1 < 3) yes so the new minIndex is 3
     * 0 1 2 3 4 | minIndex | Comparisons
     * ----------------------------------
     * 3 9 6 3 2                iiii
     * 1 9 6 3 2                 iii
     * 1 2 6 3 9                  ii
     * 1 2 3 6 9                   i
     * 1 2 3 6 9
     */
    public static void selectionSort(int[] list){
        int minIndex;
        int nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex] < list[minIndex]){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void selectionSort(double[] list){
        int minIndex;
        double nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex] < list[minIndex]){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    public static void selectionSort(Comparable[] list){
        int minIndex;
        Comparable nextSmallest;

        for(int unSortedStart = 0; unSortedStart < list.length - 1; unSortedStart++){
            minIndex = unSortedStart;
            for(int currentIndex = unSortedStart + 1; currentIndex < list.length; currentIndex++){
                if(list[currentIndex].compareTo(list[minIndex]) < 0){
                    minIndex = currentIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unSortedStart];
            list[unSortedStart] = nextSmallest;
        }
    }

    // more efficient executing time
    // exhibits linear growth
    /*
     * breaks lists into halves
     * merges halves into sorted orders
     * 6 11 2 7 5 3 13 10
     * 6 11 2 7 | 5 3 13 10
     * 6 11 | 2 7 | 5 3 | 13 10
     * 6 | 11 | 2 | 7 | 5 | 3 | 13 | 10  this is the mirror line
     * 6 11 | 2 7 | 3 5 | 10 13
     * 2 6 7 11 | 3 5 10 13
     * 2 3 5 6 7 10 11 13
     */
    public static void mergeSort(int[] list, int start, int end){
        if(start == end){
            return;
        } else if(start == end - 1){
            if(list[start] <= list[end]){
                return;
            } else { // swap
                int temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }

        int mid = (end - start) / 2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);
    }

    private static void merge(int[] list, int leftHalfStart, int rightHalfStart, int end){
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        for(int i = 0; i < leftHalfSize; ++i){
            leftHalf[i] = list[leftHalfStart + i];
        }
        for(int j = 0; j < rightHalfSize; ++j){
            rightHalf[j] = list[rightHalfStart + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while(i < leftHalfSize && j < rightHalfSize){
            if(leftHalf[i] <= rightHalf[j]){
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftHalfSize){
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightHalfSize){
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Comparable[] list, int start, int end){
        if(start == end){
            return;
        } else if(start == end - 1){
            if(list[start].compareTo(list[end]) <= 0){
                return;
            } else { // swap
                Comparable temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }

        int mid = (end - start) / 2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);
    }

    private static void merge(Comparable[] list, int leftHalfStart, int rightHalfStart, int end){
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        Comparable[] leftHalf = new Comparable[leftHalfSize];
        Comparable[] rightHalf = new Comparable[rightHalfSize];

        for(int i = 0; i < leftHalfSize; ++i){
            leftHalf[i] = list[leftHalfStart + i];
        }
        for(int j = 0; j < rightHalfSize; ++j){
            rightHalf[j] = list[rightHalfStart + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while(i < leftHalfSize && j < rightHalfSize){
            if(leftHalf[i].compareTo(rightHalf[j]) <= 0){
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftHalfSize){
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightHalfSize){
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static int linearSearch(Comparable target, Comparable[] list){
        int index = 0;
        while(index < list.length){
            if(list[index].compareTo(target) == 0){
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        long start = System.nanoTime();
        //selectionSort(input);
        long end = System.nanoTime();
        System.out.println("Elapsed time in ns: " + (end - start));

        Integer[] numbers = new Integer[1000000];
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(1000000);
        }
    }
}