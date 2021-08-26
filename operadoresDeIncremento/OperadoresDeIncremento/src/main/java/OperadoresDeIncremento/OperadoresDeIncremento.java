/*
Aqui vou usar operadores de incremento é decremento para resolver um
problema qualquer
aparentimente funciona como um contador do python
*/
package OperadoresDeIncremento;


public class OperadoresDeIncremento {
    public static void main(String[]orgs) {
    int num = 10;
    int resultado = 0;
    /*
    
    nesse caso só vai modificar o valor de num
    usou o pós-fixo resultado fica 10
    */
    System.out.println("valor original:"+resultado);
    resultado = num++; // primeiro atribui, depois incrementa
    System.out.println("valor de num após o incremento: "+num);
    System.out.println("valor do resultado após o incremento: "+resultado);
    
    // pré-fixo nesse caso abaixo
    // resultado se modifica também
    num = 10; resultado = 0;
    
    resultado = ++num; // primeiro incrementa, depois atribui
    System.out.println("valor de num após incremento: "+num);
    System.out.println("valor de result após o incremento: "+resultado);
    
    
    }
    
}
