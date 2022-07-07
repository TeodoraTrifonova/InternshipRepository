import Shapes.Circle;
import Shapes.Shape;

import java.util.List;

public class GenericPrint {

    public static void print(List<? extends Shape> shapes) {

        // shapes.forEach(shape ->shape.area());
        for (Shape shape : shapes) {

            if (shape instanceof Circle) {
                System.out.println("its a circle");
            }
            shape.area();
        }
    }
}
