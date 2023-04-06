package Wileyedge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameOfClicks {
    public static void totalWays(int lowest_channel,int highest_channel,int blocked_list,ArrayList<Integer>Blocked,int view_list,ArrayList<Integer>viewList){
        int result=0;
        ArrayList<Integer>totalways=new ArrayList<>();
        for(int i=0;i<view_list;i++){
            if(Blocked.contains(i)){
                continue;
            }
            else {
                totalways.add(i);
            }
        }
        for(int j=0;j<totalways.size();j++){

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lowest_channel=sc.nextInt();
        int highest_channel=sc.nextInt();
        int blocked_list=sc.nextInt();
        ArrayList<Integer>Blocked=new ArrayList<>();
        for(int i=0;i<blocked_list;i++){
            Blocked.add(sc.nextInt());
        }
        int view_list=sc.nextInt();
        ArrayList<Integer>viewList=new ArrayList<>();
        for(int i=0;i<view_list;i++){
            viewList.add(sc.nextInt());
        }
        totalWays(lowest_channel,highest_channel,blocked_list,Blocked,view_list,viewList);
    }
}

//5
//        15   2
//        14   1
//        17   2
//        1T   1
//        17   1
