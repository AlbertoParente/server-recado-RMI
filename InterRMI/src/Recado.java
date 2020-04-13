import java.io.Serializable;

public class Recado implements Serializable {
	public static final	long serialVersionUID = 2281079886752254553L;
	
	private int codigo;
	private String texto;
	private String nome;
	
	public Recado() {
		super();
	}

	public Recado(int codigo, String texto, String nome) {
		super();
		this.codigo = codigo;
		this.texto = texto;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}