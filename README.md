# Micro Serviço de e-mail usando JavaMail
<h2>Um MicroServiço com E-mail, é possível enviar com corpo HTML e com vários anexos.</h2>

<h3>Foi usando o MailHog um SMTP de saidas de e-mails para testar os envios do e-mail. o programa faz um building entre as portas para que isso seja possível
MailHog foi desenvolvido pela linguagem GoLang e você pode encontrar mais informações <a href="https://github.com/mailhog/MailHog">clicando aqui.</a></h3

<div><img src="https://github.com/B4rry4ll3n/microservicojava/blob/master/MailHog-Web-UI-Quicklook.png" alt="figura-mailhog"></div>

<div>
<h1>O projeto foi divido em 5 pacotes</h2>
<h3>BEAN</h3>
<p>Essa classe eu trago as informações principais do programa, que trás o destinatário e o remetente.
</p>

<h3>DTO</h3>

</p><p>No dto eu trouxe a construção do corpo do e-mail onde pela propriedade StringBuilder é capaz até de trazer corpos HTML para envio.
<h3>MODEL</h3>
<p>Construtores,getters and setters do destinatário, assunto e texto do e-mail. </p>
<h3>SERVICE</h3>
<p>Foi criado o método de envio lançando uma execção e capturando os erros e enviando para o Log de erros no pacote Util.</p>
<h3>UTIL</h3>
<p>Pacote destinado a logs de erros de envio de e-mail.</p>
</div>
