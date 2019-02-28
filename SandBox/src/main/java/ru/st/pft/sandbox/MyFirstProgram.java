package ru.st.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("Andrey");
    Square s = new Square(4);
    Rectangle r = new Rectangle(2,4);
    //r.lenA = 2;
    //r.lenB =4;
    //s.lenA = 4;
    //int lenA = 5;
    //int lenB = 3;

    System.out.println("Rectangle Square is " + area(s));
    System.out.println("Rectangle Square is " + area(r));
  }

  public static void hello(String someBody) {
    System.out.println("Hello," + someBody + "!");
  }

  public static double area(Square s) {
    return s.lenA * s.lenA;
  }

  public static double area(Rectangle r) {
    return r.lenA * r.lenB;
  }
}
