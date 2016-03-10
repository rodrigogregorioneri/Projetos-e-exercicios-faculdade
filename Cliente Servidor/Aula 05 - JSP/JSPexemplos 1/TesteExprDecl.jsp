<%--  TesteExprDecl.jsp   --%>

<%!
	     	int  sorteio( ){
               int gerado = 0;
               java.util.Random  numero = new  java.util.Random  ( );
               do{
                   gerado =  (int) numero.nextInt( );
 		       }while (gerado<0 || gerado > 1000);
 	           return(gerado);
	  	    }//fim do método
%>

<html>
      <h1>Sorteio</h1>
      <p>
          O numero sorteado da sorte .....   -->>    
 		  <%=  sorteio( )    %>  
      </p>
</html>
