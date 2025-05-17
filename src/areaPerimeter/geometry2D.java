package areaPerimeter;

public class geometry2D {

    private float length;
    private float breadth;

    public geometry2D(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength(){return length;}
    public float getBreadth(){ return breadth;}

    public void setLength(float length){this.length=length;};
    public void setBreadth(float breadth){this.breadth=breadth;};

    public String area(){
        float ar = length*breadth;
        return "The area of the shape is: "+ ar;

    }

    public String perimeter() {
        float pr = 2*(length*breadth);
        return "The perimeter of the shape is: "+ pr;
    }


}
