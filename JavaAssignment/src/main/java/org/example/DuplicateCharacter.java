package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> m=new HashMap<>();
        String s=sc.next();
        char[] c = s.toCharArray();
        String d="";
        for(char ch:c){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char ch : m.keySet()){
            if(m.get(ch)>1){
                System.out.print(d+" ");
            }
        }
    }
}
