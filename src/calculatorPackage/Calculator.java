package calculatorPackage;

public class Calculator {
    private float x;
    private float y;

    public Calculator(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
        }

    public void setX(float x){
        this.x=x;
        }
    public void setY(float y){
        this.y=y;
        }

    public float add(){
        return x+y;
        }
    public float mul(){
        return x*y;
        }

    @Override
    public String toString(){
        return "Addition of the given numbers is "+add() +"\n"+ "Multiplication of the given numbers is "+mul();
        }
    }

