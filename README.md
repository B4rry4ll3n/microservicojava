# microservicojava
##Um MicroServiço com E-mail, é possível enviar com corpo HTML e com vários anexos.

Foi usando o MailHog um SMTP de saidas de e-mails para testar os envios do e-mail. o programa faz um building entre as portas para que isso seja possível
MailHog foi desenvolvido pela linguagem GoLang e você pode encontrar mais informações <a href="https://github.com/mailhog/MailHog">clicando aqui.</a>


##O projeto foi divido em 5 pacotes.
###Bean
Essa classe eu trago as informações principais do programa, que trás o destinatário e o remetente.
###dto
No dto eu trouxe a construção do corpo do e-mail onde pela propriedade StringBuilder é capaz até de trazer corpos HTML para envio.
###model
Construtores,getters and setters do destinatário, assunto e texto do e-mail. 
###service
Foi criado o método de envio lançando uma execção e capturando os erros e enviando para o Log de erros no pacote Util.
###util
Pacote destinado a logs de erros de envio de e-mail.
