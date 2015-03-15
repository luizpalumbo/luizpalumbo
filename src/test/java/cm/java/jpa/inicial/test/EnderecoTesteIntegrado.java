package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.Endereco;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EnderecoTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =              Testes Unitarios            =
  // ======================================

  @Test
  public void deveriaCriarUmEndereco() throws Exception {

    Endereco endereco = new Endereco(getIdRandomico(), "Rua da Assembléia 10", "Bairro: Centro", "Rio de Janeiro", "RJ", "20011901", "BR");
    tx.begin();
    em.persist(endereco);
    tx.commit();
    assertNotNull("O Id não deveria ser nulo", endereco.getId());
  }
}