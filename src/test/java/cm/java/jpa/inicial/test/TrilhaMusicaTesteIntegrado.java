package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.TrilhaMusica;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class TrilhaMusicaTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
  public void devericaCriarUmaTrilha() throws Exception {

    TrilhaMusica trilha = new TrilhaMusica("Sgt Pepper Lonely Heart Club Ban", 4.53f, "Ouça o trompete com atenção, é o George Harrison tocando");
    tx.begin();
    em.persist(trilha);
    tx.commit();
    assertNotNull("O ID não deve ser nulo", trilha.getId());
  }
}