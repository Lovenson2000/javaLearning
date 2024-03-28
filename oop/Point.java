package ObjectOrientedProgramming;

class Point {

    public double x, y;
    public static Point origin = new Point();

    public void clear() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double distance(Point that) {
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public static void main(String[] args) {

        Point lowerLeft = new Point();
        Point upperRight = new Point();
        Point middlePoint = new Point();

        lowerLeft.x = 23.3;
        lowerLeft.y = 26.7;

        upperRight.x = 12.0;
        upperRight.y = 18.0;

        middlePoint.x = 13.2;
        middlePoint.y = 6.8;

        double d = lowerLeft.distance(upperRight);
        System.out.println(d);

        Point originPoint = Point.origin;
        System.out.println(lowerLeft.x + " " + lowerLeft.y); // 23.3 26.7
        lowerLeft.clear();
        System.out.println(lowerLeft.x + " " + lowerLeft.y); // 0.0 0.0

    }

}
