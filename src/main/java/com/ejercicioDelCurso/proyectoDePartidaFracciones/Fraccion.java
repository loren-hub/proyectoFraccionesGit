package main.java.com.ejercicioDelCurso.proyectoDePartidaFracciones;

public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		int numerador, denominador, mcm=mcm(sumando1.denominador, sumando2.denominador);
	    numerador=mcm/sumando1.denominador*sumando1.numerador+mcm/sumando2.denominador*sumando2.numerador;
	    denominador=mcm;
	    return new Fraccion(numerador, denominador);
		
	}
	
	public static Fraccion resta(Fraccion sumando1, Fraccion sumando2) {
		int numerador, denominador, mcm=mcm(sumando1.denominador, sumando2.denominador);
		numerador=mcm/sumando1.denominador*sumando1.numerador-mcm/sumando2.denominador*sumando2.numerador;
	    denominador=mcm;
	    return new Fraccion(numerador, denominador);
		
	}
	
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
		int numerador, denominador;
		numerador=sumando1.numerador*sumando2.numerador;
		denominador=sumando1.denominador*sumando2.denominador;
		return new Fraccion(numerador, denominador);
		
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
		int numerador, denominador;
		numerador=sumando1.numerador*sumando2.denominador;
		denominador=sumando1.denominador*sumando2.numerador;
		return new Fraccion(numerador, denominador);
		
	}
	
	public static Fraccion simplifica(Fraccion entrada) {
		int dividir=mcd(entrada.numerador, entrada.denominador);
	    entrada.numerador/=dividir;
	    entrada.denominador/=dividir;
	    return entrada;
		
	}
	
	public static int mcd(int a, int b) {
		int resto;
		int max=Math.max(Math.abs(a), Math.abs(b));
	    int min=Math.min(Math.abs(a), Math.abs(b));
	    do {
	    	resto=max%min;
	    	max=min;
	    	min=resto;
	    }while(min!=0);
		return max;
		
	}
	
	public static int mcm(int a, int b) {
		int mcm;
		mcm=((a*b)/mcd(a, b));
		return mcm;
	}
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}
