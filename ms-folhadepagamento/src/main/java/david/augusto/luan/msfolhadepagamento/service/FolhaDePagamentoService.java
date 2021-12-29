package david.augusto.luan.msfolhadepagamento.service;

import david.augusto.luan.msfolhadepagamento.domain.FolhaDePagamento;
import david.augusto.luan.msfolhadepagamento.domain.Funcionario;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import david.augusto.luan.msfolhadepagamento.service.mapper.FolhaDePagamentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class FolhaDePagamentoService {

    @Value("${ms-funcionario.host}")
    private String hostFuncionario;

    private final FolhaDePagamentoMapper mapper;
    private final RestTemplate restTemplate;

    public FolhaDePagamentoDTO getFolhaPagamento(Long id, Integer dias) {
        Map<String, String> variaveisURI = new HashMap<>();
        variaveisURI.put("id", ""+id);

        Funcionario funcionario = restTemplate.getForObject(
                hostFuncionario + "/api/funcionarios/{id}", Funcionario.class, variaveisURI);

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getSalarioPorDia(),
                dias);

        return this.mapper.toDTO(folhaDePagamento);
    }
}
