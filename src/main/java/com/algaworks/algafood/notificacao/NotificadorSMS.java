package com.algaworks.algafood.notificacao;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Qualifier("urgente")
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
