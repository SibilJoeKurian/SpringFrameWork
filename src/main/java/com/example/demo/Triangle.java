package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Triangle {
String triangleType;
public void draw(){
    System.out.println("This "+triangleType+"is drawn");
}

}
