<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>
<body>
<%
//objetos para manipulação do banco
Connection con;
PreparedStatement pstm;
String sql;
//variável para armazenar o endereço do banco
String url = "jdbc:mysql://localhost/aula";
try{
	//carregar o drive do mysql
	Class.forName("com.mysql.jdbc.Driver");
	//conexão com a base de dados aula4
    con = DriverManager.getConnection(url,"root","root");
	//instrução SQL
	sql = "INSERT INTO alunos (rgm,nome,curso,email) VALUES (?,?,?,?)";
	//cria o objeto para o comando SQL
	pstm = con.prepareStatement(sql);
	//configura os parâmetros indicados por ?
	pstm.setString(1,request.getParameter("rgm"));
	pstm.setString(2,request.getParameter("nome"));
	pstm.setString(3,request.getParameter("curso"));
	pstm.setString(4,request.getParameter("email"));
	//chamamos o método para gravar dados no banco
	int retorno = pstm.executeUpdate();
	if (retorno > 0)
		out.print("Dados gravados com sucesso");
	else
		out.print("Erro. Tente novamente");
}
catch(SQLException ex){
	out.print(ex.getMessage());
}
%>
</body>
</html>