package br.com.caelum.fj91.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JmsMessageListener implements MessageListener {

	public void onMessage(Message message) {

		try {
			TextMessage text = (TextMessage) message;
			System.out.println("mensagem recebida: " + text.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
