package com.recurssion;

import java.util.*;

class range{
  public static String getNumbersInRange(int start,int end){
       
       String str="";
       
       if(start<0||end<0){
           return "-1";
       }else if(start==end){
           return "-2";
       }else if(start>end){
           return "-3";
       }else{
           if(start==end){
               str+=start;
           }else{
                start++;
                if(start<end){
                str+=start+" "+getNumbersInRange(start,end);
                }
           }
       }
      return str;
  }
}
public class GetNumbersInRange
{
  public static void main(String[] args)
  { 
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Input starting number :");
      int start=sc.nextInt();
      System.out.print("Input ending number :");
      int end=sc.nextInt();
      sc.close();
      
      String result=range.getNumbersInRange(start,end);
      
      System.out.print(result);
      
  }
}