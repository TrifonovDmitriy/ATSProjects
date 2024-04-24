package ru.task1_3;

public class Task3 {
    public static void method(int x){
        if(x>0){
            x+=1;
        } else if (x<0) {
            x-=2;
        }else{
            x=10;
        }
        System.out.println(x);
    }
}
