package lesson09_interface;

public interface Fax {
	String FAX_NUMBER = "02-1234-5678";
	void send(String mag);
	void receive(String msg);
}