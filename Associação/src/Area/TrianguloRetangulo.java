package Area;

public class TrianguloRetangulo implements Poligono {
    private double catetoA;
    private double catetoB;
    private double hip;

    public TrianguloRetangulo(double catetoA, double catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hip= Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));

    }

    @Override
    public double calcularArea() {
        return catetoA*catetoB/2;
    }

    @Override
    public double calcularPerimetro() {
        return catetoA+catetoB+hip;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    public double getHip() {
        return hip;
    }

    public void setHip(double hip) {
        this.hip = hip;
    }
    
}
