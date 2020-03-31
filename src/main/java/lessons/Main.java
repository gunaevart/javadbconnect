package lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

class Main
{

    public static ArrayList arrayShape(){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Круг", "Красный"));
        shapes.add(new Square("Квадрат", "Синий"));
        return shapes;
    }

    public static void printShape(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("ИМЯ " + shape.getName());
            System.out.println("ЦВЕТ " + shape.getColor());
        }
    }


    public static ArrayList arrayFigure(){
        ArrayList<Figures> figures = new ArrayList<>();
        figures.add(new Box());
        return figures;
    }
    public static void printFigures(ArrayList<Figures> figures){
        for (Figures figure: figures) {
            System.out.println(figure.getName());
            System.out.println(figure.getAge());

        }
    }


    public static void main(String[] args) throws Exception {
        printFigures(arrayFigure());

    }


}

