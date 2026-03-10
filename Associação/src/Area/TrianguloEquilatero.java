package Area;

public class TrianguloEquilatero implements Poligono {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado*3;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
