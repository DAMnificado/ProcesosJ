package Example08_Hotel_EXAM;

public class Client extends Thread {

	private Hotel hotel;

	public Client(String number, Hotel hotel) {
		super(number);
		this.hotel = hotel;
		
		//START EN EL CONSTRUCTOR DEL HILO
		start();
	}

	public void run() {
		
		try {
			// SOLO TRY EN SLEEP
			sleep((int) (Math.random() * 10000));
		} catch (InterruptedException e) {
		}

		
		hotel.enter();
		//EL GETNAME COGE EL NUMBER "Cliente " + i DEL CONSTRUCTOR
		System.out.println(getName() + " entra");

		
		try {
			// SOLO TRY EN SLEEP
			sleep((int) (Math.random() * 20000));
		} catch (InterruptedException e) {
		}
		
		
		

		hotel.leave();
		System.out.println(getName() + " sale");

	}

}
