/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.java.jpa.inicial.test;

/**
 *
 * @author Palumbo
 */

import cm.java.jpa.entidades.DespesasMes;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class DespesasMesTesteIntegrado extends TestePersistenciaAbstrato{
  // ======================================
  // =        Testes Unitários            =
  // ======================================
  
@Test
public void RegDespesa() throws Exception {

    DespesasMes desp_mensal = new DespesasMes(201503, "contas do mes", "2.500 reais");
    
    tx.begin();
    em.persist(desp_mensal);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", desp_mensal.getMesRef());
    
}    
    
}
