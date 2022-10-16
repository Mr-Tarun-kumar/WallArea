package com.tarun;

public class WallArea {
    private double width;
    private double hieght;


    public WallArea() {

        this(22.43,5.50);
    }

    public WallArea(double width, double hieght) {
        if (width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
    if (hieght<0){
        this.hieght=0;
    }else {
        this.hieght=hieght;
    }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
       if (width<0){
           this.width=0;
       }else
           this.width = width;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {

        if (hieght<0){
            this.hieght=0;
        }else
            this.hieght = hieght;
    }
public double aera(){

        return (width*hieght);
}


}

