package Figuras;
public class Pruebas {
    public static void main(String[] args){
        int resultado;
        int Segresultado;
        int Tersresultado;
        Rectangulo rectangulo = new Rectangulo(2,6,4);//Base,Altura,Lados
        Rectangulo Srectangulo = new Rectangulo(2,6,4);

        Circulo circulo = new Circulo(20,0);//Radio,Lados
        Circulo Scirculo = new Circulo(20,0);

        Triangulo triangulo = new Triangulo(2,6,3);//Base,Altura,Lados
        Triangulo Striangulo = new Triangulo(2,6,3);

        resultado = (circulo.compareTo(Scirculo));
        Segresultado = (rectangulo.compareTo(Srectangulo));
        Tersresultado = (triangulo.compareTo(Striangulo));
        System.out.println(resultado);
        System.out.println(Segresultado);
        System.out.println(Tersresultado);
    }
}

