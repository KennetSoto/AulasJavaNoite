package exOO2;
/*
 * 2. Faça um programa que receba 3 valores que representam um triangulo,
a partir desses valores recebidos retorne se é um triangulo isósceles, equilátero, escaleno.
 */

public class Triangulo {
	public double area1;
	public double area2;
	public double area3;
	public String tipoTri;
	
	public String tipoTriangulo(double area1, double area2, double area3) {
		if(area1 == area2 && area2 == area3){
			return "equilatero";
		}
		if(area1 == area2 || area2 == area3 || area1 == area3) {
			return  "isosceles";
		}
		else{
			return  "escaleno";
		}
		
	}
}
