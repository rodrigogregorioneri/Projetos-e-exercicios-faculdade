class Processa {

  public Processa() {
     float a=1.1f, b=2.2f; int c=3; String str="Uma string qualquer";
     Retangulo retang = new Retangulo (3, 6);
     metodoExemplo(a, b, c, str, retang);
     System.out.println("" +  a + "  " + b + "  " + c + "  "  + str +  "  "
     	                   + retang.getLadoA() +  "  "  + retang.getLadoB() );
  }

  public void metodoExemplo(float pa, float pb, int pc, String st, Retangulo ret){
  	//poderíamos chamar os parâmteros de a,b,c,str,retang
  	pa = 12.4f;
    pb = 98.7f;
    pc = 62;
    st = "Texto modificado";  //String modificada
    ret.altera(32, 28);   //objeto modificado
  }
}

class Retangulo {
	private float ladoA, ladoB;

	public Retangulo (float ladoA, float ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public void altera (float ladoA, float ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public float getLadoA() {
		return ladoA;
	}

	public float getLadoB() {
		return ladoB;
	}

}

public class ExemplosParametros {
  public static void main (String args[]) {
     Processa app = new Processa();
  }
}