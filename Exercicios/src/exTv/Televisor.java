package exTv;
/*
 * Crie uma classe Televisor. Essa classe deve possuir três atributos: 
canal // inicia em 1 e vai até 16 
volume // inicia em 0 e vai até 10 
ligado // inicia em desligado ou false
e a seguinte lista de métodos:
aumentarVolume()    // Aumenta em 1 o volume 
reduzirVolume()        // Diminui em 1 o volume 
subirCanal()        // Aumenta em 1 o canal 
descerCanal()        // Diminui em 1 o canal 
ligarTelevisor()    // Liga a televisão 
desligarTelevisor()    // Desliga a televisão 
mostrarStatus()        // Dizer qual o canal, o volume e se o televisor está ligado
 */

public class Televisor {
	public int canal = Math.max(1, 16);
	public int volume = Math.max(0,10);
	public boolean ligado = true;
	
	public int aumentarVolume(int volume) {
		int aumVolume = volume +1;
		return aumVolume;		
	}
	public int reduzirVolume(int volume) {
		int dimVolume = volume -1;
		return dimVolume;		
	}
	public int subirCanal(int canal) {
		int aumCanal = canal +1;
		return aumCanal;		
	}
	public int descerCanal(int canal) {
		int dimCanal = canal -1;
		return dimCanal;		
	}
	public boolean ligarTelevisor(boolean ligado) {
		boolean tvLig = true;
		return tvLig;		
	}
	public boolean desligarTelevisor(boolean ligado) {
		boolean tvDes = false;
		return tvDes;		
	}
	public void mostrarStatus(int volume, int canal, boolean ligado) {
		System.out.printf("O status da TV é: "+ ligado, canal, volume);
		
	}
}
