package code;

/**
 * This is my first JavaDoc
 * @author Himanshu Bhatt
 */
public class JavaDocExample {

    public static void main(String[] args){
        int sq = getSquare(7);
        System.out.println(sq);

    }

    /**
     * This method return the Square of the given number
     * @param x give an integer.
     * @return this returns an integer that is square of the given integer.
     */
    public static int getSquare(int x){
        return x*x;
    }
}
