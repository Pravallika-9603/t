package org.neoteric.java.baic;

public class PrimeSeries {

    public static void main(String[] args) {
        for(int i=2;i<90;i++){
            int c=0;
            for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        c+=1;
                        break;
                    }

            }
            if(c==0){
                System.out.println(i);
            }
        }

    }

}
