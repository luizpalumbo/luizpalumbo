package cm.java.jpa.inicial.test;


import cm.java.jpa.entidades.ConsumidorUmParaUmUniJoin;
import cm.java.jpa.entidades.EnderecoEnt;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ConsumidorUmParaUmUniJoinTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
  public void deveriaCriarUmConsumidorComUmEndereco() throws Exception {

    ConsumidorUmParaUmUniJoin consumidor = new ConsumidorUmParaUmUniJoin("Bruno", "Penha", "cm.java.frameworks@gmail.com", "1234565");
    EnderecoEnt endereco = new EnderecoEnt("Rua da Assembleia, 10", "Bairro: Centro", "Rio de Janeiro", "RJ", "20011-901", "BR");
    consumidor.setEndereco(endereco);
    tx.begin();
    em.persist(consumidor);
    em.persist(endereco);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", consumidor.getId());

    consumidor = em.find(ConsumidorUmParaUmUniJoin.class, consumidor.getId());
    assertNotNull("O endereco do consumidor não deveria ser nulo", consumidor.getEndereco());
  }
}