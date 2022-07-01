package main.java.com.dsa;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: Leetcode#295 - Find Median from Data Stream
 */
public class FindMedianFromDataStream {
    private static PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder()); // this is max heap it return the maximum element
    private static PriorityQueue<Integer> large = new PriorityQueue<>();// this is min heap it return the minimum element
    // we store first half (smaller element) in max heap
    // we store second half (larger element) in min heap
    private static boolean even = true;

    public static double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }
// in case of even elements add the element to min heap and then take the value out of min heap and put it in max heap
// in case of odd elements reverse the procedure
public static void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }


    public static void main(String[] args) {
        FindMedianFromDataStream findMedianFromDataStream= new FindMedianFromDataStream();
        findMedianFromDataStream.addNum(-1);
        System.out.println(findMedianFromDataStream.findMedian());
        findMedianFromDataStream.addNum(-2);
        System.out.println(findMedianFromDataStream.findMedian());
        findMedianFromDataStream.addNum(-3);
        System.out.println(findMedianFromDataStream.findMedian());
        findMedianFromDataStream.addNum(-4);
        System.out.println(findMedianFromDataStream.findMedian());
        findMedianFromDataStream.addNum(-5);
        System.out.println(findMedianFromDataStream.findMedian());


    }

}
