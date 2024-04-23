public class areaCal {
    public static void main(String[] args) {
        double largestArea = 0;
        double recordGH = 0;
        double recordNG = 0;
        double radius = 10;
        double longSide = 10 * Math.sqrt(2);
        double area;
        double EG, GO;
        double GH, NG;
        double EN;

        // loop through all possible lengths of GO
        for (double length = 0; length < radius; length+=0.0001) {
            GO = length;

            // calculate area
            GH = Math.sqrt(2 * Math.pow(GO, 2));
            EG = radius - GO;
            EN = (longSide - GH) / 2;
            NG = Math.sqrt(Math.pow(EG, 2) + Math.pow(EN, 2));
            area = NG * GH;

            // check if area is larger than the largest area
            if (area > largestArea) {
                largestArea = area;
                recordNG = NG;
                recordGH = GH;
            }
            System.out.println("iteration: " + length);
        }

        // print the final result
        System.out.println("Largest area: " + largestArea);
        System.out.println("NG = " + recordGH);
        System.out.println("GH = " + recordGH);
    }
}
