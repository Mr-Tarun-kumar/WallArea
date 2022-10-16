package com.tarun;

public class Main {

    public static void main(String[] args) {
        WallArea w1=new WallArea(5,4);
        System.out.println("Wall of area="+w1.aera());


        w1.setHieght(-1.5);
        System.out.println("width="+w1.getWidth());
        System.out.println("hieght="+w1.getHieght());
        System.out.println("aera=" +w1.aera());
    }
}
