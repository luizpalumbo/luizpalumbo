package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.NoticiaClasseId;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class NoticiaClasseIdTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
  public void deveriaCriarUmaNoticia() throws Exception {

    NoticiaClasseId noticia = new NoticiaClasseId("Projeto Google Code será desativado", "PT", "Nove anos após o lançamento, o Projeto Google Code será desativado no dia 25 de janeiro de 2016.");
    tx.begin();
    em.persist(noticia);
    tx.commit();
    assertNotNull("O Id não deveria ser nulo", noticia.getTitulo());
  }
}