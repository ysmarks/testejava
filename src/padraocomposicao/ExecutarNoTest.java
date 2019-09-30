package padraocomposicao;

import java.util.ArrayList;
import java.util.List;

public class ExecutarNoTest {

	public static void main(String[] args) {
		 No a = new No("a"); No b = new No("b"); 
		 No c = new No("c"); No d = new No("d");
		 No e = new No("e"); No f = new No("f");
		 No g = new No("g"); No h = new No("h");
		 
		 a.addAdjacentes(b); b.addAdjacentes(c); c.addAdjacentes(d); d.addAdjacentes(e);
		 e.addAdjacentes(f); f.addAdjacentes(g); g.addAdjacentes(h); h.addAdjacentes(a);
		 
		 List<No> l = new ArrayList<>();
		 a.buscaProfundidade(l);
		 for (No no : l) {
			System.out.println(no);
		}
	}
}
