package ru.st.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("Andrey");
    Square s = new Square(4);
    Rectangle r = new Rectangle(2, 4);
    Point pointA = new Point(2, 3);
    Point pointB = new Point(3, 5);
    System.out.println("(Function)Ditance from poin A " + pointA.pointX + "/" + pointA.pointY +
            " to point B " + pointB.pointX+"/"+pointB.pointY + " is " + distance(pointA, pointB));

    System.out.println("(Method)Ditance from poin A " + pointA.pointX + "/" + pointA.pointY +
            " to point B " + pointB.pointX+"/"+pointB.pointY + " is " + pointA.distance(pointA, pointB));

    System.out.println("Area of Square is " + s.area() + " side is " + s.lenA);
    System.out.println("Area of Rectangle is " + r.area() + " sides are " + r.lenA + " and " + r.lenB);

  }

  public static void hello(String someBody) {
    System.out.println("Hello," + someBody + "!");
  }

  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((b.pointX - a.pointX), 2) + Math.pow((b.pointY - a.pointY), 2));
  }


}
