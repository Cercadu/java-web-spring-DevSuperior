package impressoras;

import impressao.impressora;
import impressao.imprimivel;

public class impressoraEpsom implements impressora{

	@Override
	public void imprimir(imprimivel imprimivel) {
		System.out.println("********************************************************************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("********************************************************************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("********************************************************************");
		System.out.println("===================      EPSON                   ==================*");
		System.out.println("********************************************************************");
		
	}
}
