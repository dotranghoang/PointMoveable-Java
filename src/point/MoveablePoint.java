package point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveablePoint extends Point{
    private double xSpeed = 0.0 , ySpeed = 0.0;
    private double[] arraySpeed = new double[2];

    public MoveablePoint() {
    }

    public MoveablePoint(double xSpeed , double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x , double y , double xSpeed , double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed , double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getArraySpeed() {
        arraySpeed[0] = xSpeed;
        arraySpeed[1] = ySpeed;
        return arraySpeed;
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
       return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint with {xSpeed , ySpeed} = "+ Arrays.toString(getArraySpeed())
                + " is subclass of " + super.toString();
    }
}
