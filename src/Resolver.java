import com.goit.javaonline.com.goit.module4.CalcSquare;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class Resolver {
    public static void main(String[] args) {
        CalcSquare sq = new CalcSquare();
        double h = 10, s = 5;
        System.out.println("Triangle h=" + h + ", s=" + s + ". Square is " + sq.TriangleSquare(h, s));

    }
}
