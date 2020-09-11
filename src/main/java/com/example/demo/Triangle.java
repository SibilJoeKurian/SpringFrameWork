package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class Triangle {
List<Point> pointList;

public void print(){
    pointList.forEach(point -> System.out.println(point.toString()));
}
}
