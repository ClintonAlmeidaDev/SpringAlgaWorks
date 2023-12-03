package com.algaworks.algafood.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}
