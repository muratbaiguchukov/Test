package com.company.task1;
import java.util.*;

public class Array {
    public static void main(String[] args) throws Exception {

        ArrayList<String> myStrSong = new ArrayList<>();
        ArrayList<String> myStrSong2 = new ArrayList<>(myStrSong.size() + 1);
        myStrSong.add("Ветер с моря дул");
        myStrSong.add("Нагонял беду");
        myStrSong.add("И сказал ты мне");
        myStrSong.add("Больше не приду");
        System.out.println(myStrSong);
        System.out.println(myStrSong.size());
        myStrSong.add(1, "Ветер с моря дул");
        myStrSong.add(3, "Нагонял беду");
        myStrSong.add(5, "И сказал ты мне");
        myStrSong.add(7, "Больше не приду");
        myStrSong.remove(4);
        myStrSong.remove(4);
        System.out.println(myStrSong);


        }
    }

