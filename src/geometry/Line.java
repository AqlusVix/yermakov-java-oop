package geometry;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setStart(int x1, int y1){
        this.start = new Point(x1, y1);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setEnd(int x1, int y1){
        this.end = new Point(x1, y1);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
