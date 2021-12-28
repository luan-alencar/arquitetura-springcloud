package david.augusto.luan.msfuncionario.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_FUNCIONARIO")
@Getter
@Setter
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 7721951656832849803L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "salario_dia")
    private Double salarioPorDia;
}
