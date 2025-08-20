package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueDuplicateEle {
    public static void main(String[] args) {
        int c=0;

        Map<Integer, Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }
        for(int x:m.keySet()){
            if(m.get(x)>1){
                c++;
            }
        }
        System.out.println(c);
    }





}
