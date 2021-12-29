package david.augusto.luan.msfolhadepagamento.service.mapper;

import david.augusto.luan.msfolhadepagamento.domain.Funcionario;
import david.augusto.luan.msfolhadepagamento.service.dto.FuncionarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FuncionarioMapper extends EntityMapper<Funcionario, FuncionarioDTO> {
}
