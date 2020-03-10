package racional;
/**
 *
 * @author Siabreu
 */
public class Racional {
    //atributos
    private int numerador;
    private int denominador;
    
    //construtor

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    
    //getters e setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador == 0)
            this.denominador = 1;
        else if(denominador < 0 )
            this.denominador = Math.abs(denominador); 
        else
            this.denominador = denominador;
    }    
    
    //multiplicação de racionais
    public void multiplicar(Racional r){
       this.numerador = this.numerador * r.getNumerador();
       this.denominador = this.denominador * r.getDenominador();
    }
    
    //soma
    public void somar(Racional r){
        this.numerador = this.numerador * r.getDenominador() + r.getNumerador() * this.denominador;
        this.denominador = this.denominador * r.getDenominador();
        
    }
    
    //divisão
    public void dividir(Racional r){
       int inversor;
       
       inversor = r.getNumerador();
       r.setNumerador(r.getDenominador());
       r.setDenominador(inversor);
       
       this.multiplicar(r);
       
    }
    //subtracao
    public void subtrair(Racional r){
        this.numerador = -r.getNumerador();
        r.getDenominador();
    }
    
    @Override
    public String toString() {
        if(this.denominador == 1)
            return "" + this.numerador;
        else                
            return this.numerador + "/" + this.denominador;        
    }   
}
