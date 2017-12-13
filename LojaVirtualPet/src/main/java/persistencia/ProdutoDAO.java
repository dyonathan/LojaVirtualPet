package persistencia;

import java.io.Serializable;

import org.hibernate.*;

import beans.Produto;

public class ProdutoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static void inserir(Produto produto) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction
	}

}
