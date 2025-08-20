package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset {
    public static void printSubsts(int a[]){
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int i:a){
            List<List<Integer>> l=new ArrayList<>();
            for(List<Integer> x:ans){
                List<Integer> y=new ArrayList<>(x);
                y.add(i);
                l.add(y);
            }
            for(List<Integer> x:l){
                ans.add(x);
            }
        }

        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printSubsts(a);
    }
}
