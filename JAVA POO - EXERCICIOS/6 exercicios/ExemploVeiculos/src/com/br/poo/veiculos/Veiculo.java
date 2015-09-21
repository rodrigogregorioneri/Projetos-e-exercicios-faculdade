package com.br.poo.veiculos;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Veiculo {
        //---- Atributos ----
        private String placa;
        private String marca;
        private String modelo;
        private int ano;
        private double preco;
        private int tipo; // 0 - Carro; 1 - Caminhão; 2 - Moto
        
        //---- Construtores ----
        public Veiculo()
        {
            placa = "AAA-0000";
            marca = "Fiat";
            modelo = "Palio";
            ano = 2014;
            preco = 50000.00;
            tipo = 0;
        }
        
        public Veiculo(String placa, String marca, String modelo, int ano, double preco, int t)
        {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.preco = preco;
            this.tipo = t;
        }
        
        //---- Outros Métodos ----
        /**
         * 
         * @return String com os dados serializados
         */
        public String toString()
        {
            String resposta = "";
                resposta += "Placa: "+this.placa+"\n";
                resposta += "Marca: "+this.marca+"\n";
                resposta += "Modelo: "+this.modelo+"\n";
                resposta += "Ano: "+this.ano+"\n";
                resposta += "Preço: "+this.preco+"\n";
                resposta += "Tipo: ";
                switch(this.tipo)
                {
                    case 0:
                        resposta += "carro\n";
                        break;
                    case 1:
                        resposta += "caminhão\n";
                        break;
                    case 2:
                        resposta += "moto\n";
                        break;
                    default :
                        resposta += "tipo não cadastrado\n";
                        break;
                }
            return resposta;
        }
        
        
        //---- Getter e Setter ----
        public String getPlaca()
        {
            return placa;
        }
        
        public void setPlaca(String p)
        {
            this.placa = p;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getTipo() {
            return tipo;
        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }
        
        
}
