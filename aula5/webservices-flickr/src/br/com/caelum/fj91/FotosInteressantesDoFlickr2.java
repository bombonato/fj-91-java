package br.com.caelum.fj91;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class FotosInteressantesDoFlickr2 {

	public static void main(String[] args) throws HttpException, IOException {
		// Para uma nova key, acesse:
		// http://www.flickr.com/services/api/keys
		String url = "http://api.flickr.com/services/rest/?method=flickr.interestingness.getList&api_key=81abd32cd0747e05b7e0b2ce0c804886&";

		HttpClient client = new HttpClient();
		GetMethod get = new GetMethod(url);
		client.executeMethod(get);
		String response = get.getResponseBodyAsString();

		System.out.println(response);

		XStream stream = new XStream(new DomDriver());
		Annotations.configureAliases(stream, Photo.class, Result.class);

		List<Photo> photos = ((Result) stream.fromXML(response)).getPhotos();
		System.out.println(photos);
		System.out.println("Carregando imagem.");

		new FotoFrame(photos);
	}
}