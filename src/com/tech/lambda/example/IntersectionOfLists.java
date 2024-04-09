package com.tech.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfLists {
    public static List<Integer> findIntersectionUnsortedLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        Set<Integer> intersection = new HashSet<>();

        for (int num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        return new ArrayList<>(intersection);
    }
    
    public static List<Integer> findIntersectionSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i);
            int num2 = list2.get(j);

            if (num1 == num2) {
                intersection.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        List<Integer> intersection1 = findIntersectionUnsortedLists(list1, list2);

        System.out.println("Intersection of the two lists: " + intersection1);
        
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 8));

        List<Integer> intersection2 = findIntersectionSortedLists(list3, list4);

        System.out.println("Intersection of the two lists: " + intersection2);
    }
}
