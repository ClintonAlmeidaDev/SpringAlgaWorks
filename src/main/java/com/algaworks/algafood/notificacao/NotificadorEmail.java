package com.algaworks.algafood.notificacao;



import com.algaworks.algafood.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
	
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("Notificador Email");
	}
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s: %s usando o SMTP %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
