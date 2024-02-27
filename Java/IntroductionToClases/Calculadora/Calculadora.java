
package CalculadoraOpp;


public class CalculadoraOpp {
    int num2;
    int num1;
    float Operacion;
    //Constructor Method
    public CalculadoraOpp(int c, int d, float e ){
        num1 = c;
        num2 = d;
        Operacion = e;
    }
    public float Multiplicacion (int c, int d){
        num1 = c; 
        num2 = d;
        Operacion = c*d;
        return Operacion;
    }
    public float Divicion (int c, int d){
        num1 = c; 
        num2 = d;
        Operacion = c/d;
        return Operacion;
    }
    public float Suma (int c, int d){
        num1 = c; 
        num2 = d;
        Operacion = c+d;
        return Operacion;
    }
    public float Resta (int c, int d){
        num1 = c; 
        num2 = d;
        Operacion = c-d;
        return Operacion;
    }
    public float PotenciaNum1 (int c,int d){
        num1 = c; 
        num2 = d;
        Operacion = c*c;
        return Operacion;
    }
    public float PotenciaNum2 (int c, int d){
        num1 = c;
        num2 = d;
        Operacion = d*d;
        return Operacion;
    }
    public void Imprimir () {
        System.out.println("El resultado es: " + Operacion);
    }

    public static void main(String[] args){
        CalculadoraOpp resultado = new CalculadoraOpp(0, 0, 0);
        resultado.Multiplicacion(23, 56);
        resultado.Imprimir();
        resultado.Resta(23, 56);
        resultado.Imprimir();
        resultado.Divicion(4, 2);
        resultado.Imprimir();
        resultado.Suma(23, 56);
        resultado.Imprimir();
        resultado.PotenciaNum1(4,4);
        resultado.Imprimir();
        resultado.PotenciaNum2(4,4);
        resultado.Imprimir();
    }
}

