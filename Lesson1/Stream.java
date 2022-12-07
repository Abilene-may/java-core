package Lesson1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Lesson1.Child;

public class Stream{

    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("abc");
        list.add("cde");
        list.add("abc");
        list.add("efd");

        // Độ dài của list là size()
        // for(int i=0; i< list.size()-1; i++){
        //     if(list.get(i).equals("abc")){
        //         System.out.println(i);
        //     }
        // }

        // Lấy giá trị của index -> get(index)
        // indexOf lấy index của đối tượng
        // for(String str : list){
        //     if(str.equals("abc")){
        //         System.out.println(list.indexOf(str));
        //     }
        // }

        // for(String str : list){
        //    System.out.println(str.toUpperCase());
        // }

        // System.out.println(list.toString());
        //filter
        // List<String> newList = list.stream().filter(x -> x.equals("abc")).collect(Collectors.toList());

        // List<String> listMap = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

        // System.out.println(listMap.toString());

        // System.out.println(newList.toString());

        Farther farther = new Farther("Ông a");
        farther.run();

        Child child = new Child("Con ông a");
        System.out.println(child.toString());
        child.run();
    }
}