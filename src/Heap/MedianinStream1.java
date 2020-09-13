//Find the median in the stream
package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianinStream1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i] = s.nextInt();
        }
        double[] result = getMedians(ar);
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i] + " ");
        }

    }

    public static double[] getMedians(int[] array){
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
        double[] medians = new double[array.length];
        for (int i = 0; i < array.length ; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }
        return medians;
    }
    private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if(lowers.size() == 0 || number < lowers.peek()){
            lowers.add(number);
        }
        else {
            highers.add(number);
        }
    }

    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if(biggerHeap.size() - smallerHeap.size() >= 2){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

        if(biggerHeap.size() == smallerHeap.size()){
            return ((double)biggerHeap.peek() + smallerHeap.peek())/2;
        }
        else {
            return biggerHeap.peek();
        }
    }

}
