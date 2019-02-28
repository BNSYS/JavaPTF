package ru.st.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("Andrey");
    int lenA = 5;
    int lenB = 3;

    System.out.println("Rectangle Square is " + area(lenA));
    System.out.println("Rectangle Square is " + area(lenA, lenB));
  }

  public static void hello(String someBody) {
    System.out.println("Hello," + someBody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double lenA, double lenB) {
    return lenA * lenB;
  }
}
