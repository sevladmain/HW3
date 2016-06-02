import com.goit.javaonline.module4.CalcSquare;
import com.goit.javaonline.module4.TemperatureTransform;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Resolver {
    public static void main(String[] args) {
        CalcSquare sq = new CalcSquare();
        double h = 10, s = 5;
        System.out.println("Triangle h=" + h + ", s=" + s + ". Square is " + sq.TriangleSquare(h, s));
        double s1 = 5, s2 = 6;
        System.out.println("Rectangle s1=" + s1 + ", s2=" + s2 + ". Square is " + sq.RectangleSquare(s1, s2));
        double r = 5;
        System.out.println("Circle r=" + r + ". Square is " + sq.CircleSquare(r));
        TemperatureTransform t = new TemperatureTransform();
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        double c = 5, f = 4;
        t.setCelTemp(c);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
        t.setFarTemp(f);
        System.out.println("Cels=" + t.getCelTemp() + ", Farenh=" + t.getFarTemp());
    }
}
