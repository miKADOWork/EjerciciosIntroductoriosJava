
public class Main {

	public static void main(String[] args) {
		Car cochecito1 = new Car(20,23);
			System.out.println(cochecito1.getFuel());
			System.out.println(cochecito1.getMaxSpeed());
		Car cochecito2 = new Car(21,53);
			System.out.println(cochecito2.getFuel());
			System.out.println(cochecito2.getMaxSpeed());
		Car cochecito3 = new Car(10,100);
			System.out.println(cochecito3.getFuel());
			System.out.println(cochecito3.getMaxSpeed());
		// Creamos un objecto para llamar al costructor vacio
		Car cochecito4 = new Car();
			// nos retornara 0
			System.out.println(cochecito4.getFuel());
			System.out.println(cochecito4.getMaxSpeed());
		
		System.out.println("\n\n Apartado de clase targeta: \n\n");
		// Instanciamos una targeta:
		Tarjeta visa = new Tarjeta("BBVA", "Federico Garcia Lorca", "1234567812345678", "24/02/2026");
		
		// creamos algunos gastos y mostramos los saldos
		System.out.println("El saldo inicial es: " + visa.returnLiquidity()+ " "+ visa.divisa);
		System.out.println("Creamos un gasto de 200 EUR");
		visa.pay(200);
		System.out.println("El saldo actual es: " + visa.returnLiquidity()+ " "+ visa.divisa);
		System.out.println("Creamos un gasto de 20.23 EUR");
		visa.pay(20.23);
		System.out.println("El saldo actual es: " + visa.returnLiquidity()+ " "+ visa.divisa);
		System.out.println("Intentamos un gasto de 900 EUR");
		visa.pay(900);
		System.out.println("El saldo actual es: " + visa.returnLiquidity()+ " "+ visa.divisa);
	}

}

