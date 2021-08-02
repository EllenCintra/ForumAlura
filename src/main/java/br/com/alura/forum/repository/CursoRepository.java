package br.com.alura.forum.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;
/**
 * 1º parâmetro: quem é a entidade que esse recurso vai trabalhar
 * 2º parâmetro: tipo da chave primária
 * @author ellen
 *
 */
public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);
}
