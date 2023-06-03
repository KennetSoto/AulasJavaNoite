package exTv;
/*
 * Crie uma classe Televisor. Essa classe deve possuir tr�s atributos: 
canal // inicia em 1 e vai at� 16 
volume // inicia em 0 e vai at� 10 
ligado // inicia em desligado ou false
e a seguinte lista de m�todos:
aumentarVolume()    // Aumenta em 1 o volume 
reduzirVolume()        // Diminui em 1 o volume 
subirCanal()        // Aumenta em 1 o canal 
descerCanal()        // Diminui em 1 o canal 
ligarTelevisor()    // Liga a televis�o 
desligarTelevisor()    // Desliga a televis�o 
mostrarStatus()        // Dizer qual o canal, o volume e se o televisor est� ligado
 */

public class Televisor {
	public int canal; 
	public int volume;
	public boolean ligado;
	
	public void aumentarVolume() {
		if(volume >= 0 && volume <=10) {
			volume +=1;
		}	
	}
	public void reduzirVolume() {
		if(volume >= 0 && volume <=10) {
			volume -= 1;
		}
	}
	public void subirCanal() {
		if(canal == 0) {
			canal +=1;
		}
		if(canal >= 1 && canal <= 16) {
			canal +=1;
		}
	}
	public void descerCanal() {
		if(canal == 0) {
			canal -=1;
		}
		if(canal >= 1 && canal <= 16) {
			canal -=1;
		}
	}
	public void ligarTelevisor() {
		ligado = true;	
		canal = 1;
	}
	public void desligarTelevisor() {
		ligado = false;
	}
	public void mostrarStatus() {
		if(ligado == true) {
		System.out.println("O status da TV �: ligada, no canal "+canal+" e no volume "+ volume);
		}else {
			System.out.println("Televisor desligado");
		}
	}
}
