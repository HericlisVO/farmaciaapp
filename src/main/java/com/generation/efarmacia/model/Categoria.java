package com.generation.efarmacia.model;


	import java.util.List;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		@Size(min = 3, max = 255)
		private String nome;
		
		@NotNull
		@Size(min = 3, max = 255)
		private String descricao;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties
		private List<Produto> produto;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
		


}
