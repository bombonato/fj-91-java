package br.com.caelum.fj91.jms;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MandaMensagem {

	public static void main(String[] args) throws NamingException, JMSException {
		InitialContext context = new InitialContext();
		ConnectionFactory factory = (ConnectionFactory) context
				.lookup("ConnectionFactory");
		Connection connection = factory.createConnection();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		connection.start();

		Destination caelum = (Destination) context.lookup("fj91");

		MessageProducer sender = session.createProducer(caelum);
		TextMessage message = session.createTextMessage("FJ-91 vendido!");
		
		sender.send(message);
		
		session.close();
		connection.close();
	}
}
