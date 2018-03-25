package model;

public class Petshop {

	private int idPetshop;
	private String nome;
	
	private double longitude;
	private double latitude;
	private String endereco;
	private String bairro;
	private String estado;
	private String cnpj;
	private String caminho;
	
	public Petshop() {}
	
	public Petshop(int id, String nome) {
		this.idPetshop = id;
		this.nome = nome;
	}
	
	public Petshop(
			int id, String nome, double latitude, double longitude,
			String endereco, String bairro, String estado, String cnpj, String caminho) {
		
		this.idPetshop = id;
		this.nome = nome;
		this.longitude = longitude;
		this.latitude = latitude;
		this.endereco = endereco;
		this.bairro = bairro;
		this.estado = estado;
		this.cnpj = cnpj;
		this.caminho = "";
	}

	public int getIdPetshop() {
		return idPetshop;
	}

	public void setIdPetshop(int idPetshop) {
		this.idPetshop = idPetshop;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

}
