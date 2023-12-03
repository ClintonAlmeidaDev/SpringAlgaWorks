package com.algaworks.algafood.notificacao;



import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {
	
	
	public NotificadorEmailMock() {
		System.out.println("Notificador email MOCK");
	}
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("MOCK: Notificando %s através do e-mail  MOCK %s: %s \n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	

	
}