package comparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Length object = new Length();
        object.variables();
    }
}
class Length{
    //Function for reading User input
    void variables(){
        Scanner scan = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;

        System.out.println("Enter X1 coordinates:");
        x1= scan.nextInt();
        System.out.println("Enter Y1 coordinates:");
        y1= scan.nextInt();
        System.out.println("Enter X2 coordinates:");
        x2= scan.nextInt();
        System.out.println("Enter Y2 coordinates:");
        y2= scan.nextInt();
        scan.close();
        computationLength(x1,x2,y1,y2);
    }
    //Function for calculating the Length
    void computationLength(double x1,double x2,double y1, double y2){

        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+distance);

    }
}
