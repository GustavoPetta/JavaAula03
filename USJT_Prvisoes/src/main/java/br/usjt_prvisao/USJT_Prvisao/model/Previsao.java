package br.usjt_prvisao.USJT_Prvisao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String dia;
	private Double minima;
	private Double maxima;
	private Double humidade;
	private String descricao;
	private String data;
	private String hora;
	private Double latitude;
	private Double longitude;
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return the minima
	 */
	public Double getMinima() {
		return minima;
	}
	/**
	 * @param minima the minima to set
	 */
	public void setMinima(Double minima) {
		this.minima = minima;
	}
	/**
	 * @return the maxima
	 */
	public Double getMaxima() {
		return maxima;
	}
	/**
	 * @param maxima the maxima to set
	 */
	public void setMaxima(Double maxima) {
		this.maxima = maxima;
	}
	/**
	 * @return the humidade
	 */
	public Double getHumidade() {
		return humidade;
	}
	/**
	 * @param humidade the humidade to set
	 */
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
}