package ru.st.pft.sandboxnew;

public class Point {

  double pointX, pointY;

  public Point(double pointX, double pointY){
    this.pointX = pointX;
    this.pointY = pointY;
  }

  public double distance(Point a, Point b){

    return Math.sqrt(Math.pow((b.pointX - a.pointX), 2) + Math.pow((b.pointY - a.pointY), 2));
  }

}
