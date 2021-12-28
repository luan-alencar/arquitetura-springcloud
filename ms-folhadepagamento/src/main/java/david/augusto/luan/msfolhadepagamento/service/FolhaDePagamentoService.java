package david.augusto.luan.msfolhadepagamento.service;

import david.augusto.luan.msfolhadepagamento.domain.FolhaDePagamento;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import david.augusto.luan.msfolhadepagamento.service.mapper.FolhaDePagamentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FolhaDePagamentoService {

    private final FolhaDePagamentoMapper mapper;

    public FolhaDePagamentoDTO getFolhaPagamento(Long funcionarioID, Integer dias) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(funcionarioID, "Luan", 30.0, dias);
        return this.mapper.toDTO(folhaDePagamento);
    }
}
