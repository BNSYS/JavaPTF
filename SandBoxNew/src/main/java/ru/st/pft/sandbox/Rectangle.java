package ru.st.pft.sandbox;

public class Rectangle {

  public double lenA, lenB;

  public Rectangle(double lenA, double lenB){
    this.lenA = lenA;
    this.lenB = lenB;
  }
  public double area() {
    return this.lenA * this.lenB;
  }
}
