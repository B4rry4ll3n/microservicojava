package br.com.javamail.usandoEmail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.objetoenviaemail.ObjetoEnviaEmail;

@SpringBootTest
class UsandoEmailApplicationTests {


	@Test
	void contextLoads() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		
		stringBuilderTextoEmail.append("<!DOCTYPE html>\n"
				+ "<html lang=\"en\">\n"
				+ "<head>\n"
				+ "    <meta charset=\"UTF-8\">\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
				+ "    <title>Document</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "    <h1>Olá, esse é um texte com HTML e JAVA</h1>\n"
				+ "    <p>Sou o Isaias e estou no caminho de se tornar um Dev</p>\n"
				+ "        <button class=\"button button1\">BotãoTeste1</button>\n"
				+ "        \n"
				+ "    \n"
				+ "</body>\n"
				+ "</html>");
		
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("paulosergiocf@protonmail.com, isaiasbarry1998@gmail.com",
				"Isaias Dev",
				"Testando anexo",
		
				stringBuilderTextoEmail.toString());
		
		
		/*Se for HTML = true, caso seja só texto = false*/
		enviaEmail.enviarEmailAnexo(true);
	
		
		}

}
