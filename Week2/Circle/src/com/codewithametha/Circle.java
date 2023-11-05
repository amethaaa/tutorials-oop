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
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * (Math.sqrt(radius));
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The circle is has a radius of " + radius + "and is " + color + " colored";
    }
}
