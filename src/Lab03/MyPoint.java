package Lab03;

/**
 * Name: Aditya Verma
 * Date: Feb 8, 2022
 * Description: Lab 03 "Objects and Class Methods" Submission for CS321.
 */
public class MyPoint {

    //Private instance variables for the object MyPoint
    private double x;
    private double y;

    //Default Constructor, no args
    public MyPoint() {
    };

    /**
     * Constructor MyPoint initialising the private instance variables
     * @param x A double value for the x-coordinate
     * @param y A double value for the y-coordinate
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * A toString() method printing the coordinates of given MyPoint object.
     * @return str; printing the coordinates of given MyPoint object.
     */
    public String toString() {
        String str = "Coordinates are: x = " + x + ", y = " + y;
        return str;
    }

    /**
     * Method computing the Euclidean distance to another point.
     * @return distance; a double; the Euclidean distance to another point.
     */
    public double distance() {
        double distance = Math.sqrt(Math.pow((this.x), 2.0) + Math.pow((this.y), 2.0));
        return distance;
    }

    /**
     * Method computing the Euclidean distance to another (x,y) coordinate.
     * @param p1 The (x,y) coordinate MyPoint object until which the Euclidean distance is computed,
     *           given another (x,y) coordinate MyPoint object.
     * @return distance; a double; the Euclidean distance between the two (x,y) coordinate inputs.
     */
    public double distance(MyPoint p1) {
        double distance = Math.sqrt(Math.pow((p1.x - this.x), 2.0) + Math.pow((p1.y - this.y), 2.0));
        return distance;
    }

    /**
     * Checks if two MyPoint objects (x-y coordinates) are equal.
     * @param p  A MyPoint object.
     * @return true; a boolean value; if the two objects are equal.
     * @return false; a boolean value; if the two objects are not equal.
     */
    public boolean equals(MyPoint p) {
        if ((this.x != p.x) || (this.y != p.y)) {
            return false;
        }
        return true;
    }

    /**
     * Checks if a MyPoint object (point) p is in the MyPoint array 'points' and returns a boolean value.
     * @param points  A MyPoint object array.
     * @param p  A MyPoint object.
     * @return true; a boolean value; if the array contains the MyPoint object p.
     * @return false; a boolean value; if the array doesn't contain the MyPoint object p.
     */
    public static boolean contains(MyPoint[] points, MyPoint p) {
        for (int i = 0; i < points.length; i++) {
            if (points[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if an array of points is in a horizontal line and returns a boolean value.
     * @param points  A MyPoint object array.
     * @return true; a boolean value; if the array of points is in a horizontal line.
     * @return false; a boolean value; if the array of points is not in a horizontal line.
     */
    public static boolean horizontal(MyPoint[] points) {
        boolean isHorizontal = true;
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i].x != points[i+1].x) {
                isHorizontal = false;
            }
        }
        return isHorizontal;
    }

    /**
     * Tests all the functions listed above.
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------------------------");
        //initialising MyPoint objects to check for contains()
        MyPoint p1 = new MyPoint(-2.0, -2.0);
        MyPoint p2 = new MyPoint(-4.0, 4.0);
        MyPoint p3 = new MyPoint(4.0, 6.0);
        MyPoint p4 = new MyPoint(-7.0, -7.0);
        MyPoint p5 = new MyPoint(4.5, 9.5);
        MyPoint p6 = new MyPoint(1.0, 1.5);
        MyPoint p7 = new MyPoint(2.0, 2.0);

        MyPoint containsCheckPoint = new MyPoint(2.0, 2.0);
        MyPoint[] myPoints = new MyPoint[] {p1, p2, p3, p4, p5, p6, p7};

        //initialising MyPoint objects to check for horizontal()
        MyPoint p8 = new MyPoint(-2.0, -2.0);
        MyPoint p9 = new MyPoint(-2.0, 4.0);
        MyPoint p10 = new MyPoint(-2.0, 6.0);
        MyPoint p11 = new MyPoint(-2.0, -7.0);
        MyPoint p12 = new MyPoint(-2.0, 9.5);
        MyPoint p13 = new MyPoint(-2.0, 1.5);
        MyPoint p14 = new MyPoint(-2.0, -2.0);

        MyPoint[] horizontalCheckArray = new MyPoint[] {p8, p9, p10, p11, p12, p13, p14};

        //testing both distance() functions
        System.out.print("Distance to point = " + p1.distance());
        System.out.println("\n--------------------------------------------------------------------");

        System.out.print("Distance between point 1 and point 2 = " + p1.distance(p2));
        System.out.println("\n--------------------------------------------------------------------");

        //testing equals()
        System.out.print("equals() result = " + p8.equals(p14));
        System.out.println("\n--------------------------------------------------------------------");

        //testing contains()
        boolean contains = contains(myPoints, containsCheckPoint);
        System.out.print("contains() result = " + contains);
        System.out.println("\n--------------------------------------------------------------------");

        //testing horizontal()
        boolean horizontal = horizontal(horizontalCheckArray);
        System.out.print("horizontal() result = " + horizontal);
        System.out.println("\n--------------------------------------------------------------------");

        //testing toString()
        System.out.print(containsCheckPoint.toString());
        System.out.println("\n--------------------------------------------------------------------");
    }
}
