import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {

    List<Figuras2D> f2d = new ArrayList<>();
   

    public void adicionaFigura(Figuras2D figura){
        f2d.add(figura);
    }
    public void removeFigura(int indice){
        f2d.remove(indice);
    }
    public double buscaArea(int indice){
        Figuras2D f = f2d.get(indice);
        return f.area();
    }
    public double buscaPerimetro(int indice){
        Figuras2D f = f2d.get(indice);
        return f.perimetro();
    }
    public String figurasNome(){
        String todasFiguras = "";
        for (Figuras2D fg: f2d) todasFiguras += fg.nomeFigura();
        return todasFiguras;
    }

}
