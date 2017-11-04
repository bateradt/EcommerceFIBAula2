package br.Fib.Ecommece;

public class Livro extends Produto {

	public Livro(String descricao, Double valor, String informacoes, String codigoBarras, Double peso) {
		super(descricao, valor, informacoes, codigoBarras, peso);
		// TODO Auto-generated constructor stub
	}

	private String Autor;
	private String Editora;
	private String ISBN;
	private String Paginas;
	private String Edicao;
	private String Ano;
	private String Assunto;
	private String Idioma;

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPaginas() {
		return Paginas;
	}

	public void setPaginas(String paginas) {
		Paginas = paginas;
	}

	public String getEdicao() {
		return Edicao;
	}

	public void setEdicao(String edicao) {
		Edicao = edicao;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public String getAssunto() {
		return Assunto;
	}

	public void setAssunto(String assunto) {
		Assunto = assunto;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

}
