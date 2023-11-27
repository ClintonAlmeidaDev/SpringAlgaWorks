package com.algaworks.algafood.service;


import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NotificadorEmail;


public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClientService " + notificador  );
	}



	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistemas está ativo");
	}
}
