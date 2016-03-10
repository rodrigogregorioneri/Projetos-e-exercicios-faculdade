<%@page contentType="text/xml"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<imagem>

<%
    response.setHeader("Pragma","no-cache");
    response.setHeader("Cache-Control","no-cache");
    try{
        Connection c = null;
        Statement s = null;
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection(
                "jdbc:mysql://localhost/aula",
                "root", "root");
        s = c.createStatement();
        int numProd = (int)(Math.random()*24)+1;
            String sql = "SELECT arqImagem FROM produto WHERE codigo = "+ numProd;
        ResultSet rs = s.executeQuery(sql);
        if(rs.next()){
            out.write("imagens/produtos/"+rs.getString(1));
        }
        c.close();
    }catch(Exception ex){
        out.write("imagens/produtos/impr_hp6540_grd.jpg");
    }
%>

</imagem>
