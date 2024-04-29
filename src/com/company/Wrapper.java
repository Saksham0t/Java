package com.company;
public class Wrapper {
    public static void main(String[] args) {

        int i = 5;
        Integer jj = i;                 //Auto Boxing
        System.out.println(jj);

//        int j = jj.intValue();         //Unboxing
        int k= jj;                     //Auto Unboxing
//
        System.out.println(k);
        System.out.println(jj);


   }
}
