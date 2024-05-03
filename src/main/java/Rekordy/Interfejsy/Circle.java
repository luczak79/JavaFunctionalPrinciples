package Rekordy.Interfejsy;

public record Circle(int x, int y, int radius) implements Origin, Area {
    public float area() {
        return (float) (Math.PI * radius * radius);
    }
}
