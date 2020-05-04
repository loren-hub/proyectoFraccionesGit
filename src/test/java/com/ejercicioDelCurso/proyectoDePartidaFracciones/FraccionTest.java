package test.java.com.ejercicioDelCurso.proyectoDePartidaFracciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.java.com.ejercicioDelCurso.proyectoDePartidaFracciones.Fraccion;

class FraccionTest {

	@Test
	void sumaTest (){
		Fraccion f1 = new Fraccion(2, 3), f2 = new Fraccion(4, 5);
		Fraccion valorEsperado = new Fraccion(22, 15);
		Fraccion valorRetornado = Fraccion.suma(f1, f2);
		assertEquals(valorEsperado.getNumerador(), valorRetornado.getNumerador());
		assertEquals(valorEsperado.getDenominador(), valorRetornado.getDenominador());
	}
	
	@Test
	void restaTest (){
		Fraccion f1 = new Fraccion(2, 3), f2 = new Fraccion(4, 5);
		Fraccion valorEsperado = new Fraccion(-2, 15);
		Fraccion valorRetornado = Fraccion.resta(f1, f2);
		assertEquals(valorEsperado.getNumerador(), valorRetornado.getNumerador());
		assertEquals(valorEsperado.getDenominador(), valorRetornado.getDenominador());
	}
	
	@Test
	void multiplicacionTest (){
		Fraccion f1 = new Fraccion(2, 3), f2 = new Fraccion(4, 5);
		Fraccion valorEsperado = new Fraccion(8, 15);
		Fraccion valorRetornado = Fraccion.multiplicacion(f1, f2);
		assertEquals(valorEsperado.getNumerador(), valorRetornado.getNumerador());
		assertEquals(valorEsperado.getDenominador(), valorRetornado.getDenominador());
	}
	
	@Test
	void divisionTest (){
		Fraccion f1 = new Fraccion(2, 3), f2 = new Fraccion(4, 5);
		Fraccion valorEsperado = new Fraccion(10, 12);
		Fraccion valorRetornado = Fraccion.division(f1, f2);
		assertEquals(valorEsperado.getNumerador(), valorRetornado.getNumerador());
		assertEquals(valorEsperado.getDenominador(), valorRetornado.getDenominador());
	}
	
	@Test
	void simplificarTest (){
		Fraccion f = new Fraccion(2, 2);
		Fraccion valorEsperado = new Fraccion(1,1);
		Fraccion valorRetornado = Fraccion.simplifica(f);
		assertEquals(valorEsperado.getNumerador(), valorRetornado.getNumerador());
		assertEquals(valorEsperado.getDenominador(), valorRetornado.getDenominador());
	}
	
	@DisplayName(value = "mcm")
    @ParameterizedTest
    @CsvSource(value = { "2,2,2", "2,3,6", "5,10,10","15,5,15" })
	void mcmTest (int a, int b, int c){
		assertEquals(Fraccion.mcm(a, b), c);
	}
	
	@DisplayName(value = "mcd")
    @ParameterizedTest
    @CsvSource(value = { "2,3,1", "6,9,3", "4,12,4","15,5,5" })
	void mcdTest (int a, int b, int c){
		assertEquals(Fraccion.mcd(a, b), c);
	}

}
