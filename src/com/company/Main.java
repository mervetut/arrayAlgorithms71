package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String [] arr = new String[] {"hello", "how", "are", "you"};
        List<String> intList = Arrays.asList(arr);
        Collections.shuffle(intList);
        intList.toArray(arr);
        System.out.println(Arrays.toString(arr));



        
        //List<String> solution = new ArrayList<>();
        //for (int i = 1; i <= 6; i++) {
        //  solution.add(i);
        //}
        //String[] firstName = new String[] {"a","b","c","d","e"};
        //List<String> strList = Arrays.asList(firstName);
        //Collections.shuffle(strList);
        //List<String> letters = Arrays.asList(string.split(""));
        //Collections.shuffle(letters);
        //String shuffled = "";
        //for (String letter : letters) {
          //  shuffled += letter;
        //}
        //return shuffled;
    }


}
