package com.codewithametha;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * (Math.sqrt(radius));
    }

    String getColor() {
        return color;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The circle is has a radius of " + radius + "and is " + color + " colored";
    }
}
