
public class Tarjeta {
	private String entidadEmisora;
	private String titular;
	private String numero;
	private String fechaCaducidad;
	private boolean isActive;
	private double saldo;
	public String divisa = "EUR";
	
	// constructor
	public Tarjeta(String emisor, String titular, String numero, String fechaCaducidad) {
		this.entidadEmisora = emisor;
		this.titular = titular;
		this.numero = numero;
		this.fechaCaducidad = fechaCaducidad;
		this.isActive = true;
		this.saldo = (float) 1000;
	}
	
	// metodos de anulación:
	public void deprecateCard() {
		this.isActive = false;
	}
	
	// metodos de activacion
	public void activateCard() {
		this.isActive = true;
	}
	
	// metodos de visualizar el saldo
	public double returnLiquidity() {
		return this.saldo;
	}
	
	// Metodos de pagar
	public void pay(double amount) {
		if ((this.saldo >= amount) && (this.isActive == true)) {
			this.saldo -=
					amount;
		}
		else {
			if (this.isActive != true) {
				System.out.println("Tarjeta desactivada");
			}
			if (this.saldo < amount) {
				System.out.println("Saldo insuficiente");
			}
		}
	}
	
	// Ingreso
	public void inncome (double amount) {
		this.saldo += amount;
	}
}

