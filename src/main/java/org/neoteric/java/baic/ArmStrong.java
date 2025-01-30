package org.neoteric.java.baic;

public class ArmStrong {

    public static void main(String[] args) {

        int n=9474;
        int p=n;
        int a=0;
        int c=0,r;
        while (n!=0){
            r=n%10;
            c+=1;
            n=n/10;
        }
       // System.out.println(c);
        while (p!=0){
            r=p%10;
            a+=(int)Math.pow(r,c);
            p=p/10;
        }
        System.out.println("a=="+a +"p=="+p);
        if(n==p){
            System.out.println("arm");
        }
    }

}
