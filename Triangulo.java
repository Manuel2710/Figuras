package Figuras;
public class Triangulo extends Figura implements Comparable<
    Triangulo>{
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double pBase, double pAltura, double pLado){
        base = pBase;
        altura = pAltura;
        lado = pLado;
    }
    public double calcularLados(){
        return lado;
    }

    public double calcularArea(){
        return (base * altura)/2;
    }
    @Override
    public int compareTo(Triangulo trianPorComparar){
        double areaPorComparar = trianPorComparar.calcularArea();
        double miArea = this.calcularArea();
        
        double perimPorComparar = trianPorComparar.calcularLados();
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