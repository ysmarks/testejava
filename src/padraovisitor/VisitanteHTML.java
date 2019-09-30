package padraovisitor;

public class VisitanteHTML implements FormatoVisitante{

	StringBuilder sb = new StringBuilder();
	
	@Override
	public void visitarTitulo(String t) {
		sb.append("<h1>" + t + "</h1>");
		
	}

	@Override
	public void visitarSubtitulo(String t) {
		sb.append("<h2>" + t + "</h2>");
		
	}

	@Override
	public void visitarParagrafo(String p) {
		sb.append("<p>" + p + "</p>");
		
	}

	@Override
	public void visitarTabela() {
		sb.append("<table>");
		
	}

	@Override
	public void visitarTabelaCabecalho(String... ct) {
		sb.append("<tr>");
		for (String c : ct) {
			sb.append("<th>" + c + "</th>");
		}
		sb.append("</tr>");
		
	}

	@Override
	public void visitarTabelaLinha(Object... o) {
		sb.append("<tr>");
		for (Object ob : o) {
			sb.append("<td>" + ob.toString() + "</td>");
		}
		sb.append("</tr>");
		
	}

	@Override
	public void visitarTabelaFim() {
		sb.append("</table>");
		
	}

	@Override
	public void visitarImagem(String path) {
		sb.append("<img src='"+ path +"'>");
		
	}

	@Override
	public Object getResultado() {
		return sb.toString();
	}

}
