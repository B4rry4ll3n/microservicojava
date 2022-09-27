package br.com.emailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;

@Named
@RequestScoped
public class EmailBean implements Serializable {
	
	private static final String DESTINATARIO = "isaiasbarry1998@gmail.com";
	private static final String ASSUNTO = "Modificar Senha";

	/**
	 * Quando trabalhamos com CDI, com anotations é preciso usar isso pra evitar erros no projeto
	 * Precisamos tambem colocar o serialVersionUID por conta da interface Serializable
	 */
	private static final long serialVersionUID = 4538755582654584073L;
	
	@Inject
	private EmailService emailservice;
	
	
	public String enviarEmail() {
		emailservice.enviar(montarEmail());
		return null;
	}
	
	private Email montarEmail() {
		EmailLayout layout = new EmailLayout();
		return layout.montarEmailAdm(DESTINATARIO,ASSUNTO );
	}
}
