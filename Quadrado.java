public class Quadrado implements Figuras2D{
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String nomeFigura() {
        return "Quadrado";
    }
    public double getArea(){
        return area();
    }

    @Override
    public int compareTo(Figuras2D f) {
        return this.area().(f.area());
    }
}
