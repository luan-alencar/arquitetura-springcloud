package david.augusto.luan.msfolhadepagamento.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FolhaDePagamentoDTO implements Serializable {

    private Long id;
    private String nome;
    private Double salarioPorDia;
    private Integer dias;

    public double getTotal() {
        return this.getDias() * this.getSalarioPorDia();
    }
}
