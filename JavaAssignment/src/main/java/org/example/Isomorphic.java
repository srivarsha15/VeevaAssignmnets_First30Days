package org.example;
import java.util.*;
public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(m.get(s.charAt(i))==t.charAt(i))
                    continue;
                else
                    return false;

            }
        }
        m=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!m.containsKey(t.charAt(i))){
                m.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(m.get(t.charAt(i))==s.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String t=sc.next();
       System.out.println(isIsomorphic(s,t));
    }
}
