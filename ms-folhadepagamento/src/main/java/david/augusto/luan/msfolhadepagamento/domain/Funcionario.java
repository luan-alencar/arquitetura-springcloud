package david.augusto.luan.msfolhadepagamento.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 7721951656832849803L;

    private Long id;
    private String nome;
    private Double salarioPorDia;
}
