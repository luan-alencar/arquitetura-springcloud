package david.augusto.luan.msfolhadepagamento.service.mapper;

import david.augusto.luan.msfolhadepagamento.domain.FolhaDePagamento;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FolhaDePagamentoMapper extends EntityMapper<FolhaDePagamento, FolhaDePagamentoDTO> {
}
