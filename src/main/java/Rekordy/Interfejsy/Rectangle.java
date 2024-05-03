package Rekordy.Interfejsy;

public record Rectangle(int x, int y, int width, int height) implements Origin, Area {

    public float area() {
        return (float) (width * height);
    }

}
