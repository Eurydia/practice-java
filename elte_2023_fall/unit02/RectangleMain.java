package elte_2023_fall.unit02;

public class RectangleMain {

    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println("Not enough arguments");
            return;
        }

        double tempX, tempY, tempWidth, tempHeight;

        for (int i = 0; i < (args.length / 4) * 4; i += 4) {
            tempX = Double.parseDouble(args[i]);
            tempY = Double.parseDouble(args[i + 1]);
            tempWidth = Double.parseDouble(args[i + 2]);
            tempHeight = Double.parseDouble(args[i + 3]);

            Rectangle tempRectangle = new Rectangle(tempX, tempY, tempWidth, tempHeight);
            System.out.println(String.format("%s;", tempRectangle.bottomLeft().toString()));
        }

    }

}
