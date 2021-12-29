package david.augusto.luan.msfolhadepagamento.resource;

import david.augusto.luan.msfolhadepagamento.service.FolhaDePagamentoService;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
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

    @GetMapping("/{id}/dias/{dias}")
    public ResponseEntity<FolhaDePagamentoDTO> getPagamento(
            @PathVariable("id") Long id,
            @PathVariable("dias") Integer dias
    ) {
        return ResponseEntity.ok(this.service.getFolhaPagamento(id, dias));
    }

}
