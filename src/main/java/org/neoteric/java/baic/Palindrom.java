package org.neoteric.java.baic;

public class Palindrom {

    public static void main(String[] args) {
        String a="churi";
        char[] ch=a.toCharArray();
        int a1=ch.length;
        String b="";
        for(int i=a1-1;i>=0;i--){

            b+=ch[i];
        }
        System.out.println(b);
    }

}
