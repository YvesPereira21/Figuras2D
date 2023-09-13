public class Circulo implements Figuras2D{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String nomeFigura() {
        return "Círculo";
    }

    @Override
    public int compareTo(Figuras2D o) {
        return 0;
    }
}
