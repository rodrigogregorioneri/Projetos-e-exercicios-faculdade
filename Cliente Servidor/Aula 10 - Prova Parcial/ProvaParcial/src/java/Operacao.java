import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operacao extends HttpServlet {

    String[][] contas = new String [][]{
        {"1","222"},
        {"2","6030"},
        {"3","350"},
        {"4","870"},
        {"5","555"},
        {"6","10"},
        {"7","450"},
        {"8","810"},
        {"9","990"},
        {"10","300"}};
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String codigo = request.getParameter("conta");
            String cpf = request.getParameter("cpf");
            String operacao = request.getParameter("operacao");
            String categoriaCliente="";
            String  mostrarTela="";
            float valorOperacao = Float.parseFloat(request.getParameter("valor"));
            for (int i=0; i<contas.length; i++){
                if(codigo.equalsIgnoreCase(contas[i][0])){
                    float saldo =0;
                    float calc = Float.parseFloat(contas[i][1]);
                    if(operacao.equals("S")){
                        saldo = calc - valorOperacao;
                    }
                    if(operacao.equals("D")){
                        saldo = calc + valorOperacao;
                    }
                    if(saldo<200){
                       categoriaCliente="Cliente Normal";
                    }
                    if(saldo>=200 && saldo<500){
                        categoriaCliente="Cliente Potencial";
                    }
                    if(saldo>=500 && saldo<1000){
                        categoriaCliente="Cliente Platinum";
                    }
                    if(saldo>=1000){
                        categoriaCliente="Cliente Preferencial";
                    }
                    mostrarTela = " O numero do seu CPF é: " + cpf  + "<br> O Código Da Sua Conta: " 
                     + contas[i][0] + "<br> Seu Saldo é de: R$ "+ saldo +"<br> Categoria de Cliente: "+categoriaCliente;     
                }
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Operação - Prova Parcial - Cliente Servidor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4>" +mostrarTela+ "</h4>");
            out.println("</body>");
            out.println("</html>");
            
            
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
