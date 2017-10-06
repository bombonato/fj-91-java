package br.com.caelum.fj91.jms;

import java.util.Scanner;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistraMessageListener {
	public static void main(String[] args) throws JMSException, NamingException {
		InitialContext initialContext = new InitialContext();

		QueueConnectionFactory factory = (QueueConnectionFactory) initialContext
				.lookup("ConnectionFactory");
		QueueConnection connection = factory.createQueueConnection();

		Queue fila = (Queue) initialContext.lookup("fj91");
		QueueSession session = connection.createQueueSession(false,
				Session.AUTO_ACKNOWLEDGE);

		QueueReceiver subscriber = session.createReceiver(fila);
		subscriber.setMessageListener(new JmsMessageListener());

		connection.start();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Tratador esperando as mensagens na fila JMS.");

		teclado.nextLine(); // Aperte ENTER para parar

		teclado.close();
		connection.close();
	}
}
