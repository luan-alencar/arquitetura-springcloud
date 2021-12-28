package david.augusto.luan.msfolhadepagamento.service;

import david.augusto.luan.msfolhadepagamento.domain.FolhaDePagamento;
import david.augusto.luan.msfolhadepagamento.repository.FolhaDePagamentoRepository;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import david.augusto.luan.msfolhadepagamento.service.mapper.FolhaDePagamentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FolhaDePagamentoService {

    private final FolhaDePagamentoRepository repository;
    private final FolhaDePagamentoMapper mapper;

    public List<FolhaDePagamentoDTO> listarTodos() {
        return this.mapper.toDTOList(this.repository.findAll());
    }

    public FolhaDePagamentoDTO buscarPorID(@PathVariable("id") Long id) {
        FolhaDePagamento FolhaDePagamento = this.repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Folha de Pagamento não encontrado! Tente novamente."));
        return this.mapper.toDTO(FolhaDePagamento);
    }

}
