package com.algaworks.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private NotificadorEmail notificador;
	 

//	public AtivacaoClienteService(String qualquer) {
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistemas está ativo");			
		}else {
			System.out.println("Não existe notificador, mas cliente foi ativado");
		}
	}

	/*
	 * @Autowired public void setNotificador(NotificadorEmail notificador) {
	 * this.notificador = notificador; }
	 */

}
