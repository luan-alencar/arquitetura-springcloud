package david.augusto.luan.msfuncionario.service.mapper;

import david.augusto.luan.msfuncionario.domain.Funcionario;
import david.augusto.luan.msfuncionario.service.dto.FuncionarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FuncionarioMapper extends EntityMapper<Funcionario, FuncionarioDTO> {
}
