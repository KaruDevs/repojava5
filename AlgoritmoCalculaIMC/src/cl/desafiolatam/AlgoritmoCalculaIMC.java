package cl.desafiolatam;

import java.util.*;

public class AlgoritmoCalculaIMC {

	static Scanner sc=new Scanner(System.in);
	
	static float peso;
	static float talla;
	static float imc;
	
	public static void main(String[] args) {
		
		obtencionDatos();
		//calculoImc(peso, talla);
		evaluaImc();
	 	}
	        	
	public static void obtencionDatos() { 
	
		System.out.println("---- Calculemos su IMC-----");
		 		  
		System.out.println("---- Digite su peso (kg): ----" );
       	 	peso= sc.nextFloat();
       
       	System.out.println("---- Digite su talla (cm): ----" );
       	 	talla= sc.nextFloat();  
	   /* }
	
	/* public static float calculoImc(float a, float b) { */ /*eliminé ese método porque no seguía 
       	 														más adelante el programa*/
		imc = Math.round((float)(peso/Math.pow(talla, 2)));  /*pow (talla,2) el primero es el índice y el 
															segundo es lo elevado*/
			//return imc;
		  System.out.println("Su imc es: "+imc );	 
		  // no pasaba porque estaba declarado dos veces al ponerle float
		}
	    
	public static void evaluaImc() {
		
		if (imc<18.5 && imc != 0f) {
		System.out.println("bajo peso"); 
			}else if (imc>=18.5 && imc <= 24.9) {
			System.out.println("Peso normal" );
				}else if (imc>=25.0 && imc <= 29.9) {
				System.out.println("Sobrepeso" );	
					}else if (imc>=30.0 && imc <= 34.9) {
					System.out.println("Obesidad tipo 1" );
						}else if (imc>=35.0 && imc <= 39.9) {
							System.out.println("Obesidad tipo 2" );
							}else if (imc>=40.0) {
								System.out.println("Obesidad tipo 3" );
								}else {System.out.println("Falla de programa" );
		
	}
  }
}		  
		  
