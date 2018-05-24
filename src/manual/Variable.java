package manual;

import java.util.Arrays;

public class Variable {
	public String tipo;
	public String id;
	public Object valor;
	public Object[] vector;
	public Integer[] dimension;
	

	@Override
	public String toString() {
		return "Variable [tipo=" + tipo + ", id=" + id + ", valor=" + valor + ", vector=" + Arrays.toString(vector)
				+ ", dimension=" + Arrays.toString(dimension) + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public Variable(String tipo, String id, Object valor) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.valor = valor;
	}

	public Variable(String tipo, String id, Object[] vector, Integer[] dimension) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.vector = vector;
		this.dimension = dimension;
	}

}
