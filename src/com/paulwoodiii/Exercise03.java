package com.paulwoodiii;

import java.util.*;

/**
 * Created by paul on 9/21/16.
 */
public class Exercise03 {
    public static void main(String[] args){
        String[] names = {"alice","bob","charlie","daniel","andrew","alex"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        //#################### Using another Array
        System.out.println(namesList);
        ArrayList<String> removeList = new ArrayList<>();
        for (String name : namesList){
            if (name.startsWith("a") ){
                removeList.add(name);
            }
        }
        for (String name : removeList){
            namesList.remove(name);
        }
        System.out.println(namesList);

        //#################### One Loop
        namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        for (int i = namesList.size() - 1; i >= 0; i--){
            if (namesList.get(i).startsWith("a")) {
                namesList.remove(i);
            }
        }
        System.out.println(namesList);

        //#################### Iterator
        namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        for (Iterator<String> i = namesList.iterator(); i.hasNext();) {
            String name = i.next();
            if (name.startsWith("a")){
                i.remove();
            }
        }
        System.out.println(namesList);


        //#################### One Line
        namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        namesList.removeIf(str -> str.startsWith("a") );
        System.out.println(namesList);

    }
}
