package com.soapservice.importWSDL;

import com.soapservice.importWSDL.service.AtendeCliente;
import jakarta.xml.ws.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class ImportWsdlApplication {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");

			QName qName = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AtendeClienteService");

			Service service = Service.create(url, qName);

			AtendeCliente port = service.getPort(AtendeCliente.class);

			XMLGregorianCalendar xmlGregorianCalendar = port.buscaDataAtual();
			System.out.println("O dia de hoje é: " + xmlGregorianCalendar.getDay());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		SpringApplication.run(ImportWsdlApplication.class, args);
	}

}
