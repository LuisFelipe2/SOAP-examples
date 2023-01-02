package com.soapservice.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CertidaoNascimento {

	@WebMethod
	public int calcularIdade(String idade);
	@WebMethod
	public String calcularDiaDaSemana(String idade);
}
