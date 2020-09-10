package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
public class Triangle {
String triangleType;
int id;
public Triangle(int id,String triangleType){
    this.id=id;
    this.triangleType=triangleType;
}
public void draw(){
    System.out.println("This "+triangleType+ " is drawn with id "+id);
}
public void check_draw(){
    System.out.println("Check draw");
}
}
