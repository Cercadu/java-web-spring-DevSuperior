package fundamentos;
class tabuada1 {
    private int numero;
    
    public void setNumero(int vNumero) {
       numero = vNumero;	
	}
    public int getNumero() {
    	return numero;
    }
    public String retTabuada (int vTabuada) {
    	String tabuada = "";
    	int numeracao = 10;
    	while  (numeracao <= vTabuada) {
    		tabuada = tabuada + "x" +vTabuada + "-" +(numeracao * vTabuada) + "\n";
    		numeracao++;
    	}
    	return tabuada;
    }	
}

