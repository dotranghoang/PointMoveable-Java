package point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point {
   protected double x = 0.0;
    protected double y = 0.0;
   private double arrayXY[] = new double[2];

   public Point() {
   }

   public Point(double x , double y) {
       this.x = x;
       this.y = y;
   }

   public double getX() {
       return x;
   }

   public void setX(double x) {
       this.x = x;
   }

   public double getY() {
       return y;
   }

   public void setY(double y) {
       this.y = y;
   }

   public void setXY(double x , double y) {
       this.x = x;
       this.y = y;
   }

   public double[] getXY() {
       arrayXY[0] = x;
       arrayXY[1] = y;
       return arrayXY;
   }

   @Override
    public String toString() {
       return "Point with {x , y} = "+ Arrays.toString(getXY());
   }
}
