package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.Consumidor;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;


public class ConsumidorTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Teste Unitários          =
  // ======================================
  @Test
  public void deveriaCriarUmConsumidor() throws Exception {

    Consumidor consumidor = new Consumidor("Joao", "da Silva", "joao@empresa.com", "1234565", new Date(), new Date());
    tx.begin();
    em.persist(consumidor);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", consumidor.getId());
  }
}