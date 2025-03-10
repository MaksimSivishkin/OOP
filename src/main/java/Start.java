public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,5);
        Point point1 = new Point(2,8);
        Point point2 = new Point(5,3);
        Point point3 = new Point(8,9);

        Line line = new Line(point, point1);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);

        PolyLine polyLine = new PolyLine();
        polyLine.AddPolyLine(line);
        polyLine.AddPolyLine(line1);
        polyLine.AddPolyLine(line2);

        System.out.println(polyLine.sumPolyLine());
        System.out.println(polyLine);
        System.out.println(polyLine.listPolyLine());
        point1.setX(12);
        System.out.println(polyLine);
    }
}