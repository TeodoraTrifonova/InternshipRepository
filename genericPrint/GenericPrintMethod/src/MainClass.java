import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String args[])
    {
        Rectangle r = new Rectangle(2,3);
        List<Circle> shapes = new ArrayList<>();
        for(int i = 0; i<10; i++)
        {
         //   Rectangle rectangle = new Rectangle(i+1,i+2);

            Circle rectangle = new Circle(i+1);
            shapes.add(rectangle);
        }

       GenericPrint.print(shapes);

    }
}
