package br.com.senaisp.bauru.gabriel.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.senaisp.bauru.gabriel.testers.ConexaoBD;

public class ProdutoSimples {

	private int id;
	private String descricao;
	private int saldo;
	private double custo;

	// Usando o conector para BD(Banco de Dados)

	private Connection conn;

	// Constructor

	public ProdutoSimples() throws SQLException {

		id = 0;
		saldo = 0;
		custo = 0;

		// Instanciando o DriverManager
		conn = ConexaoBD.getInstancia().getConn();
	}

	// Metodos (Getters and Setters)

	public int getId() {
		return id;
	}

	public void setId(int id) throws Exception {

		if (id < 0) {
			throw new Exception("O id não pode ser negativo");
		}
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	//

	public String toString() {
		return "Id: " + getId() + "\n" + "Descrição: " + getDescricao() + "\n" + "Saldo: " + getSaldo() + "\n"
				+ "Custo :" + getCusto();
	}

	//
	public void gravar() throws SQLException {
		PreparedStatement stmt = conn.prepareStatement("update produto set descricao=?, saldo=?, custo=? where id=?");
	
		// Preenchendo os Paramentos
		stmt.setString(1, getDescricao());
		stmt.setInt(2, getSaldo());
		stmt.setDouble(3, getCusto());
		stmt.setInt(4, getId());
		
		//Disparado a query
		int nRegs = stmt.executeUpdate();
		System.out.println(nRegs + "Registro(s) afetado(s)!");
		
	}
	public void apagar() throws SQLException {
		PreparedStatement stmt = conn.prepareStatement("delete from produto where id=?");
		
		// Preenchendo os Paramentos
		stmt.setInt(1, getId());
		
		//Disparado a query
		int nRegs = stmt.executeUpdate();
		System.out.println(nRegs + "Registro(s) afetado(s)!");
		
	}

	//
	public static ProdutoSimples create(String des, int sal, double cus) throws SQLException {

		ProdutoSimples ret = new ProdutoSimples();
		ret.setDescricao(des);
		ret.setCusto(cus);
		ret.setSaldo(sal);

		// Gravar no banco de dados

		// Preparando o comando para o banco de dados
		PreparedStatement stm = ret.conn.prepareStatement(
				"insert into produto(descricao,saldo,custo) " + "values (?,?,?)", Statement.RETURN_GENERATED_KEYS);

		// Os paramentos comecao com 1 e nao zero
		stm.setString(1, des);
		stm.setInt(2, sal);
		stm.setDouble(3, cus);

		// Executando o
		int linhas = stm.executeUpdate();
		System.out.println("Adicionei " + linhas + " no banco!");
		ResultSet rs = stm.getGeneratedKeys();
		rs.next();
		try {
			ret.setId(rs.getInt(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//
		return ret;
	}

	public static ProdutoSimples FindByPK(int cod) throws Exception {
		ProdutoSimples ret = new ProdutoSimples();
		if (cod > 0) {
			// Preparando istrução de select
			PreparedStatement stmt = ret.conn
					.prepareStatement("select id, descricao ,saldo ,custo " + " from produto where id = ?");

			// Colocando o parametro da query
			stmt.setInt(1, cod);

			// Executando a query
			ResultSet rs = stmt.executeQuery();

			// Verificando se encontrou algo
			if (rs.next()) {
				ret.setId(rs.getInt(1));
				ret.setDescricao(rs.getString(2));
				ret.setSaldo(rs.getInt(3));
				ret.setCusto(rs.getDouble(4));

			} else {
				throw new Exception("Reegistro não encontrado!");
			}

		} else {
			throw new Exception("O codigo deve ser mairo que zero!");
		}

		return ret;
	}

}
