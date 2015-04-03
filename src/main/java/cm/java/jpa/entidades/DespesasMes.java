package cm.java.jpa.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Esta classe foi criada para gerencia os custos mensais
 * 
 */

@Entity
@Table(name = "d_despesas_mensais")
@Access(AccessType.FIELD)

/**
 *
 * @author Palumbo
 */

public class DespesasMes {

// ======================================
// =             Atributos              =
// ======================================

@Id    
@Column(name = "mesRef", nullable = false, length = 20)        
private int mesRef;

@Column(name = "descricao", nullable = false, length = 50)
private String descricao;

@Column(name = "valor", nullable = false, length = 50)
private String valor;

/**
 * 
 * 
 * 
 */
public DespesasMes() {
  }

public DespesasMes(int mesRefParam, String descricaoParam, String valorParam ) {
    
    mesRef = mesRefParam;
    descricao = descricaoParam;
    valor = valorParam;
    
  }    
/**
 * Getters & Setters
 */

public int getMesRef() {
        return mesRef;
    }

    public void setMesRef(int mesRef) {
        this.mesRef = mesRef;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
