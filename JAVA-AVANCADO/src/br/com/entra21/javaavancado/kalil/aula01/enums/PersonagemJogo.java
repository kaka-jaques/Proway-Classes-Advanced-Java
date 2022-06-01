package br.com.entra21.javaavancado.kalil.aula01.enums;

public enum PersonagemJogo {

	BARBARO(1000, "TANK"), ANAO(100, "FERREIRO"), DRUIDA(50, "SUPORTE"), SARCEDOTE(10, "CURA");
	
	private final int HP;
	private final String DESCRIPTION;
	
	private PersonagemJogo(int vida, String descricao) {
		this.HP = vida;
		this.DESCRIPTION = descricao;
	}

	public int getHP() {
		return HP;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	
}
