package exTv;

import java.util.Scanner;
import exTv.Televisor;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Televisor tv = new Televisor();
		
	
		tv.ligarTelevisor();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.subirCanal();
		tv.subirCanal();
		tv.mostrarStatus();
		
		tv.descerCanal();
		tv.reduzirVolume();
		tv.mostrarStatus();
		
		tv.desligarTelevisor();
		tv.mostrarStatus();
	
		
				
    sc.close();
	}
}