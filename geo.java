package com.example.util;

import com.example.geometry.circle;
import com.example.geometry.rectangle;

public class geo {
    public static void main(String[] args) {
        circle cir = new circle(7);
        rectangle rect = new rectangle(5,7);

        double circleArea= Math.PI * Math.pow(cir.radius,2);
        double rectArea= (rect.length* rect.breadth );

        System.out.printf("the area of circle  is %f,the area of the rectangle %f", circleArea,rectArea);


    }
    
}
