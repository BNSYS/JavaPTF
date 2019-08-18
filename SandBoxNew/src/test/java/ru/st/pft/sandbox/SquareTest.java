package ru.st.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.st.pft.sandboxnew.Point;
import ru.st.pft.sandboxnew.Square;

public class SquareTest {
  @Test
  public void testArea(){
    Square s = new Square(5);
    //assert s.area()==24;
    Assert.assertEquals(s.area(),25.0);
  }
  @Test
  public void testPointDistance(){
    Point a = new Point(2,3);
    Point b = new Point(3,5);
    Assert.assertEquals(a.distance(a,b),2.23606797749979);

  }
}
