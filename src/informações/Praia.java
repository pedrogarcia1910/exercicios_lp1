package informações;

public class Praia {
	private String cidade;
	private String TipoAgua;
	private String nome;
	private String CorAreia;
	private String PropriaPBanho;
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Contrutor
	public Praia(String Cidade, String Nome) {
		this.cidade=Cidade;
		this.nome=Nome;
	}
	
	//metodos de acesso tipo setter
	public void setTipoAgua(String s){
		TipoAgua=s;
		
	}
	
	public void setCorAreia(String p) {
		CorAreia=p;
	}
	
	public void setPropriaPBanho(String pr) {
		PropriaPBanho=pr;
	}
	
	//metodo acesso tipo getter
	public String getCorAreia() {
		return CorAreia;
	}
	
	public String getTipoAgua() {
		return TipoAgua;
	}
	
	public String getPropriaPBanho() {
		return PropriaPBanho;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCidade1() {
		return cidade;
	}
	
	//banhe-se na praia
	public void visite() {
	System.out.println("está propria para banho, aproveite!");
	}
	
	//nao banhe-se na praia
	public void Nvisite() {
	System.out.println("está inpropria, procure outra");
	}

}