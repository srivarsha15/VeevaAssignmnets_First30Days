package org.example;

import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> l=new ArrayList<>();
        Map<Integer,String> m= Map.of(
                2,"abc",
                3,"def",
                4,"ghi",
                5,"jkl",
                6,"mno",
                7,"pqrs",
                8,"tuv",
                9,"wxyz"
        );
        String s=sc.next();
        Queue<String> q=new LinkedList<>();
        q.add("");
        while(!q.isEmpty()){
            String x=q.poll();
            if(x.length()==s.length()){
               l.add(x);
            }
            else{
                int index=x.length();
                char ch=s.charAt(index);
                String k=m.get(Character.getNumericValue(ch));
                for(char c:k.toCharArray()){
                    q.add(x+c);
                }
            }
        }
        System.out.println(l);
    }
}
