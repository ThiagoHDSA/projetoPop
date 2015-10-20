package classes;

import java.util.*;

public class Usuario {

	private String email;
	private String senha;
	private String nome;
	private String dataDeNascimento;
	private int popularidade;
	private List<Post> mural;
	private boolean logado;

	public Usuario(String email, String senha, String nome,
			String dataDeNascimento) {
		popularidade = 0;
		mural = new ArrayList<Post>();
		logado = false;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public void adicionaPost(Post post) {
		mural.add(post);
	}

	public void removePost(String horaDePublicacao) {
		for (Post post : mural) {
			if (post.getHoraDePublicacao().equals(horaDePublicacao))
				mural.remove(post);
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha.equals(this.senha))
			this.senha = senha;
		
		//Elaborar o caso da senha ser diferente
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getPopularidade() {
		return popularidade;
	}

	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

}
