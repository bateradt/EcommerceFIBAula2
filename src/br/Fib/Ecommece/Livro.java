package br.Fib.Ecommece;

public class Livro extends Produto {

	public Livro(String descricao, Double valor, String informacoes, String codigoBarras, Double peso) {
		super(descricao, valor, informacoes, codigoBarras, peso);
		// TODO Auto-generated constructor stub
	}

	private String autor;
	private String editora;
	private String iSBN;
	private String paginas;
	private String edicao;
	private String ano;
	private String assunto;
	private String idioma;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return iSBN;
	}

	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
