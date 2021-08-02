package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;
/**
 * 1º parâmetro: quem é a entidade que esse recurso vai trabalhar
 * 2º parâmetro: tipo da chave primária
 * @author ellen
 *
 */
public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//O padrão é informar primeiro o nome da entidade de relacionamento (Curso) e depois o atributo (Nome). É só declarar a assinatura do método, seguindo o padrão. Se tiver problema de ambiguidade (existir um atributo CursoNome por exemplo), poderia separar Entidade_Atributo, indicando que o atributo está dentro da entidade de relacionamento
	List<Topico> findByCursoNome(String nomeCurso);

}
