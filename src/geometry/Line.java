package geometry;

public class Line implements LengthMeasurable {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        setStart(start);
        setEnd(end);
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public void setStart(int x1, int y1){
        this.start = new Point(x1, y1);
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public void setEnd(int x1, int y1){
        this.end = new Point(x1, y1);
    }

    @Override
    public int getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return (int) Math.round(Math.hypot(dx, dy));
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
