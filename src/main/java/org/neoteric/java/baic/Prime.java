package org.neoteric.java.baic;

public class Prime {
    public static void main(String[] args) {

        int a=139;
        int c=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0) {
               // System.out.println(c);
                c += 1;
                break;
            }
        }
       // System.out.println(c);
        if(c==0){
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
