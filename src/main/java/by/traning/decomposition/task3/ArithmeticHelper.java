package by.traning.decomposition.task3;

public class ArithmeticHelper {

    public void solution (int x, int y, int z, int t) {
        double d = Math.sqrt(x*x+y*y);
        double s1=x*y*0.5;
        double s2=0.25*Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));
        double s=s1+s2;
        System.out.println("Площадь четырёхугольника " + s);
    }
}
