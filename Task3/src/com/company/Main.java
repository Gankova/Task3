package com.company;



import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // определить кол-во чаще повторяющихся символов
        String s = "{}{}({}){}{)(}";
        HashMap <Character, Integer> stroka = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (stroka.containsKey(c)){ //проверяет есть ли ключ в эту коллекции
                stroka.put(c,stroka.get(c)+1);//lj,добавляет 1 к Интежер , если ключ уже есть
                continue;
            }
            stroka.put(c, 1);
        }
        int max = 0;
        char cmax = 0;
        for (Character key : stroka.keySet()){// key.Set -возвращает все символы в хэшмэп
            int value = stroka.get(key);
            if (value > max){
                max = value;
                cmax = key;
            }
        }
        System.out.print(cmax);
        System.out.print(" :  ");
        System.out.print(max);
    }
}
