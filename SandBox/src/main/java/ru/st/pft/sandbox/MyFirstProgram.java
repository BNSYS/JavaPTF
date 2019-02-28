package ru.st.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("Andrey");
    Square s = new Square(4);
    Rectangle r = new Rectangle(2,4);


    System.out.println("Area of Square is " + s.area() + " side is " + s.lenA);
    System.out.println("Area of Rectangle is " + r.area() + " sides are " + r.lenA + " and " + r.lenB);
  }

  public static void hello(String someBody) {
    System.out.println("Hello," + someBody + "!");
  }

}
