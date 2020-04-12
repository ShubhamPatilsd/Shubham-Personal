package com.company;


public class Main {


    public static int reverse[]={1,45,3,7,9,81,34,678};

    public static void main(String[] args) {
        //int reverse[]={1,2,3,4,5,6,7};
        /*int length = 7;
        for(length-=1; length>-1; length--){
            System.out.println(reverse[length]);
        reversing(length);}*/
        reversing();




    }
    public static void reversing(){
        int reverse2=reverse.length;
        while(reverse2>0){
            reverse2--;
            System.out.println(reverse[reverse2]);
        }
        }
    }


