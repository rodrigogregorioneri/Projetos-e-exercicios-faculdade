import javax.swing.JOptionPane;

public class MixVeiculos {
   
    Veiculo veiculos[] = {
        new Automovel("ebu0174","renault","clio",2009,12000f,"verde","tatuape","sedan"),
        new Moto("ccc1111","honda","xl",2008,5000f,"verde","centro"),
        new Caminhao("bbb2233","renault","cargo",2000,90000f,"preto","lapa",80000f, 4),
        new Automovel("ebu8989","renault","clio",2009,15000f,"preto","tatuape","sedan"),
        new Moto("ddd1111","kawasaki","3000",2012,25000f,"laranja","penha")
    };
        
    public static void main(String[] args){
       new MixVeiculos();
    }
         
    public MixVeiculos() {
     //leituraDeDados();
     listaCategoria(veiculos);
     listaValor(veiculos);
     listamedia(veiculos);
     listaCoreAno(veiculos);
     listamax(veiculos);
    }
    
    public void leituraDeDados () {
        String placa,marca,modelo,cor,loja,tipoveic; int ano,qtdeixos; float preco,cargamax;
        int N = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a quantidade de veículos:"));
        veiculos = new Veiculo[N];   //aloca memória para o vetor
        for (int i=0; i<N; i++){
             placa = JOptionPane.showInputDialog( "Digite a placa do veículo " + (i+1) + ": ").toUpperCase();
             marca = JOptionPane.showInputDialog( "Digite a marca  do veículo " + (i+1) + ": ");
             modelo = JOptionPane.showInputDialog( "Digite o modelo  do veículo " + (i+1) + ": ");
             ano = Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano: "));
             preco = Float.parseFloat(JOptionPane.showInputDialog( "Digite o preço: "));
             cor = JOptionPane.showInputDialog( "Digite a cor do veículo " + (i+1) + ": ");
             loja = JOptionPane.showInputDialog( "Digite a loja do veículo " + (i+1) + ": ");
             String opcao = JOptionPane.showInputDialog("Digite 1 p/ Automóvel - "
                + "Digite 2 p/ Caminhão - Digite 3 p/ Moto");
            int opcaoescolhida = Integer.parseInt(opcao); 
            switch(opcaoescolhida) {
                case 1: //automóvel
                    tipoveic = JOptionPane.showInputDialog( "Digite o tipo do automóvel : ");
                    new Automovel(placa,marca,modelo,ano,preco,cor,loja,tipoveic);
                    break;
                case 2: //caminhão
                    cargamax = Float.parseFloat(JOptionPane.showInputDialog( "Digite a carga máx. do caminhão : "));
                    qtdeixos = Integer.parseInt(JOptionPane.showInputDialog( "Digite a qtde. de eixos do caminhão : "));
                    new Caminhao(placa,marca,modelo,ano,preco,cor,loja,cargamax,qtdeixos);
                    break;
                case 3: //moto
                    new Moto(placa,marca,modelo,ano,preco,cor,loja);
                    break;
            }
        }
    }
    
    public void listaAlunos() {
        System.out.println("");
        System.out.println("Nome dos Alunos");
        System.out.println("------------------------------");
        System.out.println("LUCIANO SILVA REIS - RGM 1476718");
        System.out.println("RAFAEL FABBRI BENASSI - RGM 1470523");    
    }     

    public static void listaCategoria(Veiculo[] veic){        
        System.out.println("LISTA DE CATEGORIAS");
        System.out.println("------------------------------");

        String opcao = JOptionPane.showInputDialog("Digite 1 p/ Listar Automóveis - "
                + "Digite 2 p/ Listar Caminhões - Digite 3 p/ Listar Motos");
        int opcaoescolhida = Integer.parseInt(opcao);        
        
        for ( int i=0 ; i<  veic.length ; i++  ){            
            if (opcaoescolhida == 1 && veic[i] instanceof Automovel ) {
                System.out.println(veic[i].toString() );
            }
        
            if (opcaoescolhida == 2 && veic[i] instanceof Caminhao )
                System.out.println(veic[i].toString() );

            if (opcaoescolhida == 3) {
               if ( veic[i] instanceof Moto ) 
                System.out.println(veic[i].toString() );
            }            
        }    
    }
    
    public static void listaValor(Veiculo[] veiculo_lj){        
       System.out.println("");
       System.out.println("LISTA DE VALORES");
       System.out.println("------------------------------");

        String opcao = JOptionPane.showInputDialog("Listar os veículos com valor abaixo de:");
        float valorescolhido = Float.parseFloat(opcao);        
        
        for ( int i=0 ; i<  veiculo_lj.length ; i++  ){            
               if ( veiculo_lj[i].getPreco() <= valorescolhido ) 
                System.out.println(veiculo_lj[i].toString() );
        }    
    }
    
    
    public static void listamedia(Veiculo[] veiculo_lj){
        float mediav, mediam ;
        int contv, contm;
        contv=0;
        contm=0;
        mediav = 0;
        mediam = 0;      

        for ( int i=0 ; i<  veiculo_lj.length ; i++  ){            
               if ( veiculo_lj[i] instanceof Moto ) {
                   contm = contm +1 ;
                   mediam = mediam +  veiculo_lj[i].getPreco() ; 
               } 
               if ( veiculo_lj[i] instanceof Automovel ) {
                   contv = contv +1 ;
                   mediav = mediav +  veiculo_lj[i].getPreco() ; 
               }
        }   
        System.out.println("Média Motos é : " +  ( mediam/contm)  );
        System.out.println("Média Automóveis é : " +  ( mediav/contv)  );
    }


    public static void listaCoreAno(Veiculo[] veiculo_lj){        
     System.out.println("");
     System.out.println("Lista Cor e Ano");
     System.out.println("------------------------------");        
     String opcaocor = JOptionPane.showInputDialog("Digite a Cor: ");
     String opcao = JOptionPane.showInputDialog("Digite o Ano: ");
     int anoescolhido = Integer.parseInt(opcao);          
        
        for ( int i=0 ; i<  veiculo_lj.length ; i++  ){            
               if ( veiculo_lj[i].getCor().equalsIgnoreCase(opcaocor)  
                       &&  veiculo_lj[i].getAno()  == anoescolhido 
                       &&  veiculo_lj[i] instanceof Automovel )
                         System.out.println(veiculo_lj[i].toString()) ;
               }           
    }    
    
    public static void listamax(Veiculo[] veiculo_lj){
     System.out.println("");
     System.out.println("Lista Maior Valor");
     System.out.println("------------------------------");
        
        int xx = 0;
        int yy = 0;        
        float ref = 0.0f ;        
        for ( int i=0 ; i<  veiculo_lj.length ; i++  ){
               if ( veiculo_lj[i].getPreco() > ref    ) {
                   xx = i ;
                   ref = veiculo_lj[i].getPreco();
               }
        }    

        ref = 9999999999.0f ;    
        for ( int i=0 ; i<  veiculo_lj.length ; i++  ){
               if ( veiculo_lj[i].getPreco() < ref    ) {
                   yy = i ;
                   ref = veiculo_lj[i].getPreco();
               }
        }    
      
        System.out.println("O veículo mais caro é  : " +  veiculo_lj[xx].toString()  );
        System.out.println("O veículo mais barato é : " +  veiculo_lj[yy].toString()  );
    }
    
}
    
    


