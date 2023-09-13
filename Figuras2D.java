public interface Figuras2D extends Comparable<Figuras2D> {
    public double area();
    public double perimetro();
    public String nomeFigura();
    int compareTo(Figuras2D figura);
}
