package main.java.com.ejercicioDelCurso.proyectoDePartidaFracciones;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.io.*;

public class AppMain {

	public static void main(String[] args) throws IOException {
		BufferedReader pe = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca que quiere hacer, cuando quiera acabar, introduzca: fin");
		System.out.println("a-Habra que intoducir 2 numeros y se indicara(si hay) el Max.Comun.Divisor");
		System.out.println("b-Habra que intoducir 2 numeros y se indicara(si hay) el Min.Comun.Multiplo)");
		System.out.println("c-");
		System.out.println("d-");
		System.out.println("e-");
		System.out.println("f-");
		System.out.println("g-");
		System.out.println("h-");
		String a = pe.readLine();
		do {
		if (a.equals("a")) {
			int peter = Integer.parseInt(pe.readLine());
			int bryan = Integer.parseInt(pe.readLine());
			Fraccion pp = new Fraccion(2,2); //Valores Contructor no importa para este ejercicio
		    int hoy = pp.mcd(peter, bryan);
			System.out.println("tu maximo comun divisor seria:" + " " + hoy);
		} else if (a.equals("b")) {
			int peter = Integer.parseInt(pe.readLine());
			int bryan = Integer.parseInt(pe.readLine());
			Fraccion pp = new Fraccion(2,2); //Valores Contructor no importa para este ejercicio
		    int hoy = pp.mcm(peter, bryan);
			System.out.println("tu minimo comun multiplo seria:" + " " + hoy);
		} else if (a.equals("c")) {
			System.out.println("Introduce numerador");
			int numerador=Integer.parseInt(pe.readLine());
			System.out.println("Introduce denominador");
			int denominador=Integer.parseInt(pe.readLine());
			Fraccion fr=new Fraccion(numerador,denominador);
			fr=Fraccion.simplifica(fr);
			System.out.print("La fraccion simplificada es: "+fr.getNumerador()+"/"+fr.getDenominador());
		} else if (a.equals("d")) {
			int numerador, denominador;
			System.out.println("Introduce numerador");
			numerador=Integer.parseInt(pe.readLine());
			System.out.println("Introduce denominador");
			denominador=Integer.parseInt(pe.readLine());
			Fraccion fr1=new Fraccion(numerador,denominador);
			System.out.println("Introduce numerador");
			numerador=Integer.parseInt(pe.readLine());
			System.out.println("Introduce denominador");
			denominador=Integer.parseInt(pe.readLine());
			Fraccion fr2=new Fraccion(numerador,denominador);
			System.out.println("Sumar o restar? (s/r)");
			String operacion=pe.readLine();
			Fraccion resultado=null;
			if(operacion.equals("s")) {
				resultado=Fraccion.suma(fr1,fr2);
			}else if(operacion.equals("r")) {
				resultado=Fraccion.resta(fr1,fr2);
			}
			System.out.print("El resultado es: "+resultado.getNumerador()+"/"+resultado.getDenominador());
		} else if (a.equals("e")) {
			//Aqui se multiplica fracciones
		} else if (a.equals("f")) {
			//Aqui se divide fracciones
		} else if (a.equals("g")) {
			//Aqui se calcula Simplificacion de fracciones
		}else if (a.equals("h")) {
			//Aqui se descomponen fracciones
		}
		a = pe.readLine();
		} while(!a.equals("fin"));
		
		/*
		 * Ejemplo de uso del método CalculosMatematicos.divisores
		 * Este método descompone un número en factores primos
		 * Retornando un mapa con los factores primos
		 */
		/*
		int num = 180;
		SortedMap<Integer,Integer> divisores = new TreeMap<>();
		divisores=CalculosMatematicos.divisores(num);
		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
			int divisor=entrada.getKey();
			int numeroVeces=entrada.getValue();
			for(int i=1;i<=numeroVeces;i++) {
			System.out.println(num+"\t|\t"+divisor);
			num=num/divisor;
			}
		}
				
		Fraccion ejempoFraccion = new Fraccion(3, 100);		
		System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+ejempoFraccion);
		*/
	}

}
