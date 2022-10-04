package com.company;

public class repeat {


    public static void main(String[] args) {
        int n = 12;
        int k = 1;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            String lenn = String.valueOf(i);
            int len = lenn.length();
            String value = String.valueOf(i);

            if (len > 1) {
                for (int j = 0; j < len ; j++) {
                    if (value.substring(j, j + 1).equals(String.valueOf(k))) {
                        count++;
                    }
                }

            }
            if (i == k) {
                count++;
            }

        }
        System.out.println(count);
    }
}


