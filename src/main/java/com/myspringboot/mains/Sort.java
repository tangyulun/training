package com.myspringboot.mains;

import java.util.Scanner;

public class Sort {
    public static void sort(){
        Scanner input = new Scanner(System.in);
        int sort[] = new int[10];
        int temp;
        System.out.println("请输入数字");
        for(int i = 0;i<sort.length; i++){
            sort[i] = input.nextInt();
        }
        for(int i = 0;i<sort.length -1; i++){
            for (int j = 0;j<sort.length -i -1; j++){
                if (sort[j]<sort[j+1]){
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
        System.out.println("排列");
        for( int i = 0 ;i<sort.length;i++){
            System.out.println(sort[i]+" ");
        }
    }
}
