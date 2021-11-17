package com.doglab.main.services;

import org.springframework.stereotype.Service;

@Service
public class CadastroService {

	public boolean validateCadastro(String name, String value) {
		return (name.equals("") || value.equals("")) ? false : true;
	}
	
}
