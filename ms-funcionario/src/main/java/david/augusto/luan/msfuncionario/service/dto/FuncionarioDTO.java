package david.augusto.luan.msfuncionario.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FuncionarioDTO implements Serializable {

    private Long id;
    private String nome;
    private Double salarioPorDia;
}
