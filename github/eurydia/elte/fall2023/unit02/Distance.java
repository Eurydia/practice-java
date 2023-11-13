package github.eurydia.elte.fall2023.unit02;
// Write the Distance program,which interprets its command line arguments as a

// sequence of points,and sums up the distances found between any two
// consecutive points(i.e.the length of a polygonal chain,or polyline).The first
// two command line arguments represent the x and y coordinates of the first
// point,then the third and fourth command line arguments represent the second
// point,and so on.We can assume that the number of command line arguments is
// even,and each command line argument is an integer number.

// The program should work by using the Point class and its distance method. For
// example, if the six coordinates of three points are provided as command line
// arguments, the program should compute the distance between the first two
// points, as well as the distance of the last two points, and print the sum of
// these two distances.

// Examples:

// > java Distance
// 0.0
// > java Distance 1 2
// 0.0
// > java Distance 0 0 3 4
// 5.0
// > java Distance 1 2 4 6
// 5.0
// > java Distance 1 2 4 6 7 6
// 8.0

public class Distance {

    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException();
        }

        Point[] pointArr = new Point[args.length / 2];

        int i, tempX, tempY;
        for (i = 0; i < args.length; i += 2) {
            tempX = Integer.parseInt(args[i]);
            tempY = Integer.parseInt(args[i + 1]);

            pointArr[i / 2] = new Point(tempX, tempY);
        }

        double totalDistance = 0.0;
        for (i = 0; i < (pointArr.length - 1); i++) {
            totalDistance += pointArr[i].distance(pointArr[i + 1]);
        }

        System.out.println(totalDistance);

    }

}