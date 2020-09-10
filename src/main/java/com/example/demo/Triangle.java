package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
public class Triangle {
Point p1;
Point p2;
Point p3;

public void print(){
    System.out.println(p1.toString());
    System.out.println(p2.toString()) ;
    System.out.println(p3.toString());
}
}
