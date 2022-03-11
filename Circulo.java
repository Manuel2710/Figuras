package Figuras;
public class Circulo extends Figura implements Comparable<
    Circulo>{
    private double Radio;
    private double lado;

    public Circulo(double pRadio, double pLado){
        Radio = pRadio;
        lado = pLado;
    }
    public double calcularLados(){
        return lado;
    }

    public double calcularArea(){
        return (Radio*Radio)*3.14;
    }
    @Override
    public int compareTo(Circulo CircPorComparar){
        double areaPorComparar = CircPorComparar.calcularArea();
        double miArea = this.calcularArea();
        
        double perimPorComparar = CircPorComparar.calcularLados();
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