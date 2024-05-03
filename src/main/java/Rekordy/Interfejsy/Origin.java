package Rekordy.Interfejsy;

public interface Origin {
    int x();
    int y();
    default String origin() {
        return String.format("(%d/%d)", x(), y());
    }
}
