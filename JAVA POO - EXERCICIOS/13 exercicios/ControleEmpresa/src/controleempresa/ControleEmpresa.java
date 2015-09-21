package controleempresa;


public class ControleEmpresa {


    public static void main(String[] args) {
       
        GereneciadorBon gb = new GereneciadorBon();
        Funcionario f1 = new Gerente("Paulo","000.000.000.00",1000.00);
        Funcionario f2 = new SecretarioAgencia("Eduardo", "111.111.111.11", 500.00);
        Funcionario f3 = new SecretarioAdm("Maria","222.222.222.22",500.00);
        gb.registra(f1);
        gb.registra(f2);
        gb.registra(f3);
        
        Cliente c1 = new Cliente("Pedro", "333.333.333.33");
        System.out.println(c1.autentica());
        System.out.println( ((Gerente)f1).autentica());
        
        System.out.println("O total de bonificações da empresa é: "+gb.getTotalBonificacoes());
        
    }
    
}
