package classes;

public class Post {

	private int popularidade;
	private String horaDePublicacao;
	private String mensagem;

	public Post(String mensagem, String horaDePublicacao) {
		popularidade = 0;
		this.mensagem = mensagem;
		this.horaDePublicacao = horaDePublicacao;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void aumentaPopularidade() {
		popularidade += 1;
	}

	public String getHoraDePublicacao() {
		return horaDePublicacao;
	}

	public String getMensagem() {
		return mensagem;
	}

	public int getPopularidade() {
		return popularidade;
	}
}
