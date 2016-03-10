<%@page contentType="text/html"%>   
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view> 
    <html> 
        <body> 
            <h:form> 
                <p> <h:outputLabel for="itUsuario" value="#{mensagens.informeUsuario} "/> 
                    <h:inputText  id="itUsuario"  value="#{controle.usuario.usuario}" required="true" requiredMessage=" #{mensagens.usuarioNaoVazio}"/> 
                    <h:message for="itUsuario"/> </p>   
                <p>   
                    <h:outputLabel for="itSenha" value="#{mensagens.informeSenha} "/> 
                    <h:inputSecret  id="itSenha"  value="#{controle.usuario.senha}" required="true" requiredMessage=" #{mensagens.senhaNaoVazio}"/> 
                    <h:message for="itSenha"/> </p> <p> 
                    <h:commandButton value="OK" action="#{controle.ok}"/> 
                </p>
<p>
<h:commandLink action="#{idiomaBean.ingles}" value="#{mensagens.ingles}" immediate="true"/> <br/> <h:commandLink action="#{idiomaBean.portugues}" value="#{mensagens.portugues}" immediate="true"/>
</p>

            </h:form> 
        </body> 
    </html>
</f:view>
