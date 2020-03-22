package emailapp;

public class Emailapp {

	public static void main(String[] args) {
		Email em1 = new Email("vihar","shah");
		em1.setaltemail("f20170119@goa.bits-pilani.ac.in");
		System.out.println(em1.getaltemail());
		em1.setmailboxcapacity(50);
		System.out.println(em1.getmailboxcapacity());
		em1.setnewpass("fd512434");
		System.out.println(em1.getnewpass());
	}

}
