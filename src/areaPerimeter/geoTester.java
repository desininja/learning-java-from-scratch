package areaPerimeter;

public class geoTester {

    public static void main(String[] args){
        geometry2D rectangle = new geometry2D(4.5f,6.5f);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());


        geometry2D square = new geometry2D(6,6);

        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
