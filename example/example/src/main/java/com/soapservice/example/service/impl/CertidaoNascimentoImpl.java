package com.soapservice.example.service.impl;

import com.soapservice.example.service.CertidaoNascimento;
import jakarta.jws.WebService;

@WebService(endpointInterface = "com.soapservice.example.service.CertidaoNascimento")
public class CertidaoNascimentoImpl implements CertidaoNascimento {
	@Override
	public int calcularIdade(String idade) {
		return 22;
	}

	@Override
	public String calcularDiaDaSemana(String idade) {
		return "Quarta-feira";
	}
}
