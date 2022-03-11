package Figuras;
public class Rectangulo extends Figura implements Comparable<
    Rectangulo>{
    private double base;
    private double altura;
    private double lado;

    public Rectangulo(double pBase, double pAltura, double pLado){
        base = pBase;
        altura = pAltura;
        lado = pLado;
    }
    public double calcularLados(){
        return lado;
    }
    public double calcularArea(){
        return base * altura;
    }
    @Override
    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        double perimPorComparar = rectPorComparar.calcularLados();
        double miPerim = this.calcularLados();
        
        if(miArea==areaPorComparar){
            if(miPerim==perimPorComparar){
                return 0;
            }
            else if (miPerim > perimPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}