package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.ConsumidorComEndereco;
import cm.java.jpa.entidades.EnderecoEmbutido;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ConsumidorEnderecoTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitarios         =
  // ======================================
  @Test
  public void deveriaCriarUmConsumidorComEnderecoEmbutido() throws Exception {

    ConsumidorComEndereco consumidor = new ConsumidorComEndereco("Bruno", "Penha", "cm.java.framework@gmail.com", "1234565");
    EnderecoEmbutido endereco = new EnderecoEmbutido("Rua da Assembleia, 10", "Bairro: Centro", "Rio de Janeiro", "RJ", "20011-901", "BR");
    consumidor.setEndereco(endereco);
    tx.begin();
    em.persist(consumidor);
    tx.commit();
    assertNotNull("A ID não deveria ser nula..", consumidor.getId());
  }
}