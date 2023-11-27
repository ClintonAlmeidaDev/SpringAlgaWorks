package com.algaworks.algafood.notificacao;



import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	public NotificadorSMS() {

	}
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s através do SMS através do telefone %s: %s \n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	

	
}
