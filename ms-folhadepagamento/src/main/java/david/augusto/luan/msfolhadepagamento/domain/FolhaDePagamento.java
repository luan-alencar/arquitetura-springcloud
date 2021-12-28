package david.augusto.luan.msfolhadepagamento.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_FOLHA_PAGAMENTO")
@Getter
@Setter
public class FolhaDePagamento implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "salario_dia")
    private Double salarioPorDia;

    @Column(name = "dias")
    private Integer dias;

    public double getTotal() {
        return this.getDias() * this.getSalarioPorDia();
    }
}
