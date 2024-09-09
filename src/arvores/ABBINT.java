package arvores;

public class ABBINT {
	private class ARVORE {
		int dado;
		ARVORE esq;
		ARVORE dir;
	}

	public ARVORE root = null;

	public ARVORE inserir(ARVORE p, int info) {
		// insere elemento em uma ABB
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		} else if (info < p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}
	public void show(ARVORE p) {
		if (p!=null) {
			show(p.esq);
			System.out.print("\t" + p.dado);
			show(p.dir);
		}
	}
	public int contaNos(ARVORE p, int cont) {
		if(p!=null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
		}	
		return cont;
	}
	public int ContaConsulta(ARVORE p, int valor, int cont) {
		if(p != null) {
			cont ++;
			if(valor == p.dado)
		return cont;
			else if(valor < p.dado)
			cont = contaConsulta(p.esq, valor, cont);
			else
				cont = contaConsulta(p.dir, valor, cont);
		}
		return cont;
	}
	
	public boolean consulta(ARVORE p, int info) {
		boolean achou = false;
		
	
		if(p != null) {
		 if (info == p.dado) 
			 achou = true;
			 else if(info < p.dado)
				 achou = consulta(p.esq, info);
			 else 
				 achou = consulta (p.dir, info);
		
		}
		
		return achou;
		
	}
	
	public int contaConsulta (ARVORE p, int valor, int cont) {
		
		if (p!=null) {
			cont++;
			if (valor == p.dado) {
				return cont;
			}else if(valor<p.dado)
				return (contaConsulta(p.esq,valor, cont));
				else
					return (contaConsulta(p.dir, valor, cont));
			}
		
		return cont;
	}
	public boolean constulta(ARVORE p, int valor) {
	if(p != null) {
		if(valor == p.dado)
			return true;
		else if (valor < p.dado)
			return constulta(p.esq, valor);
		else constulta(p.dir, valor);
	}
	return false;
}
}