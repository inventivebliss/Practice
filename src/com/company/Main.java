package com.company;

public class Main {

    public static String reverse2(String a)
    {
        String s="";
        int i,pos=0;
        for(i=0;i<a.length();i++) {
            if (a.charAt(i) == ' ') {
                s = a.substring(pos, i) + s;
                s=" " + s;
                //System.out.println(s);
                pos=i+1;
            }
        }
        s = a.substring(pos, i) + s;
        return s;
    }
    
    public static void main(String[] args) {

        String s="the sky is blue";
        System.out.print(reverse2(""));

    }

}
