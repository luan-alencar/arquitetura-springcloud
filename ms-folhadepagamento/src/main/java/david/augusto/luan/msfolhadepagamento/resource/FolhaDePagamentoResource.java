package david.augusto.luan.msfolhadepagamento.resource;

import david.augusto.luan.msfolhadepagamento.service.FolhaDePagamentoService;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import david.augusto.luan.msfolhadepagamento.service.mapper.FolhaDePagamentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/folhasdepagamentos")
public class FolhaDePagamentoResource {

    private final FolhaDePagamentoService service;
    private final FolhaDePagamentoMapper mapper;

    @GetMapping("/{funcionarioID}/dias/{dias}")
    public ResponseEntity<FolhaDePagamentoDTO> getPagamento(
            @PathVariable("funcionarioID") Long funcionarioID,
            @PathVariable("dias") Integer dias
    ) {
        return ResponseEntity.ok(this.service.getFolhaPagamento(funcionarioID, dias));
    }

}
