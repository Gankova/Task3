package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        // задача на одномерный массив
        // сортировка пузырьком
        Integer [] arr = {2,-5,8,1,12,6};
        Arrays.sort(arr,((o1, o2) -> // через метод сорт сортировать по убаванию через компаратор, по возратсанию по умолчанию //
        {if (o1 == o2){
            return 0;
        }
        if (o1> o2){
            return -1;
        }
        return 1;
        }));

        /*сортировка пузырьком отсортировать по возрастанию
        for (int i = 0 ; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] > arr[j]) {// два элемента поменять местами
                    int tmp = arr[i];
                    arr [i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }*/
        Arrays.asList(arr).stream().forEach(System.out::println);
    }
}
