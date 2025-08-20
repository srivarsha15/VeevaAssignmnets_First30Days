package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        List<String> l= Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        String arr[]=s.split(" ");
        String date="";
        date+=arr[2]+"-";
        if(l.indexOf(arr[1])<9){
            date+="0"+(l.indexOf(arr[1])+1)+"-";
        }
        else
            date+=(l.indexOf(arr[1])+1)+"-";
//        String x=String.valueOf(arr[0].charAt(0))+String.valueOf(arr[0].charAt(1));
        if(arr[0].length()==3){
            date+="0";
        }
        for(char ch:arr[0].toCharArray()){
            if(ch=='t'||ch=='h'||ch=='s'||ch=='n')
                break;
            else
                date+=ch;
        }

        System.out.println(date);

    }
}

