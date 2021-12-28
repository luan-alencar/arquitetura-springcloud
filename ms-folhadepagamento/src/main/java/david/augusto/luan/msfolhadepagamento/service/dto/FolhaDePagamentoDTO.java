package david.augusto.luan.msfolhadepagamento.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FolhaDePagamentoDTO implements Serializable {

    private Long id;
    private String nome;
    private Double salarioPorDia;
    private Integer dias;
}
