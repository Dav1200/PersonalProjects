package com.company;

public class oneloopsort {
    public static int[] sorter(int ar[])
    {
        int k=ar.length-1;
        boolean b=true;
        int m=0;
        int n=1;
        while(b)
        {
            if(k==m){
                if(n==0)
                {
                    break;
                }
                m=0;
                n=0;

            }

            if(ar[m]>ar[m+1])
            {
                int tmp=ar[m+1];
                ar[m+1]=ar[m];
                ar[m]=tmp;
                n=1;

            }
            m++;
        }
        return ar;
    }
    public static void main(String[]args)
    {
        int arr[]={2,4,52,7,45,6,3};
        int k[]=sorter(arr);
        for(int h=0;h<arr.length;h++)
        {
            System.out.println(" "+k[h]);
        }

    }

}