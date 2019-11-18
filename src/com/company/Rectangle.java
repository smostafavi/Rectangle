package com.company;

public class Rectangle {

    private double width;
    private double height;
    private double area;
    private double perimeter;

    // main Constructor created
    public Rectangle() {
        this.width=1;
        this.height=1;
        //overload constructor is created
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }



    public double getPerimeter() {
        return 2*(width + height);
    }



    public Rectangle(double width, double height){
           this.width = width;
           this.height= height;

        }
    }




