package comparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Length object = new Length();
        object.variables();
    }
}
//Class for storing all the required logic
class Length{
    //Function for reading User input
    void variables(){
        Scanner scan = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double distance1;
        double a1;
        double b1;
        double a2;
        double b2;
        double distance2;
        System.out.println("(Line-1)Enter X1 coordinates:");
        x1= scan.nextInt();
        System.out.println("(Line-1)Enter Y1 coordinates:");
        y1= scan.nextInt();
        System.out.println("(Line-1)Enter X2 coordinates:");
        x2= scan.nextInt();
        System.out.println("(Line-1)Enter Y2 coordinates:");
        y2= scan.nextInt();
        System.out.println("(Line-2)Enter X1 coordinates:");
        a1= scan.nextInt();
        System.out.println("(Line-2)Enter Y1 coordinates:");
        b1= scan.nextInt();
        System.out.println("(Line-2)Enter X2 coordinates:");
        a2= scan.nextInt();
        System.out.println("(Line-2)Enter Y2 coordinates:");
        b2= scan.nextInt();
        scan.close();
        computationLength(x1,x2,y1,y2,a1,a2,b1,b2);
    }
    //Function for calculating the Length
    void computationLength(double x1,double x2,double y1, double y2,double a1,double a2,double b1,double b2){

        double distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+distance1);
        double distance2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
        System.out.println("The length of line-2 is :"+distance2);
        comparison(distance2,distance1);
    }
    //Function for comparing lengths
    void comparison(double distance1, double distance2){
        if(distance1 == distance2){
            System.out.println("The line lengths are equal");}
        else
            System.out.println("The line lengths are not equal");
    }
}
