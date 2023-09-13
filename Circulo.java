import java.util.Random;

public class Circulo implements Figuras2D{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public Double area() {
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
    public int compareTo(Figuras2D f) {
        return this.area().compareTo(f.area());
    }
    
    public static Circulo brincaCirculo(int valMax){
        Random randomiza = new Random();
        int valorRandomiza = randomiza.nextInt(valMax);
        return new Circulo(valorRandomiza);
    }
}
