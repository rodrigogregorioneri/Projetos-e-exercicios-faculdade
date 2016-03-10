<%-- Teste06.jsp --%>
<html>
<body> 

<h1>Teste06.jsp</h1>
<h2>Utilizando coleções e formulários HTML. Gerando de uma resposta HTML dinâmica.</h2>
   
<form action="ProcessaComidas.jsp" method="post">

   Digite seu nome: <input type="text" name="nomePessoa"><br><br>

   <input type="radio" name="sexoPessoa" value="m" checked>Masculino<br>
   <input type="radio" name="sexoPessoa" value="f">Femenino<br>
   
   <br>
     Suas comidas favoritas:<br>
     <input type="checkbox" name="favs" value="salada">Salada<br>
     <input type="checkbox" name="favs" value="pizza">Pizza<br>
     <input type="checkbox" name="favs" value="carnes">Carnes<br>
     <input type="checkbox" name="favs" value="frango-peixes">Frango e peixes<br>
     <input type="checkbox" name="favs" value="massas">Massas<br>
     <input type="checkbox" name="favs" value="sobremesa">Sobremesa<br>
     <input type="checkbox" name="favs" value="frutas">Frutas<br><br>
     <input type="submit" value="Enviar"><br>
</form>
</body> 
</html>

