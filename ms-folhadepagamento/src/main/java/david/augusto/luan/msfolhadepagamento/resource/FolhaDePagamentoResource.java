package david.augusto.luan.msfolhadepagamento.resource;

import david.augusto.luan.msfolhadepagamento.service.FolhaDePagamentoService;
import david.augusto.luan.msfolhadepagamento.service.dto.FolhaDePagamentoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.annotation.Timed;


import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor_ = {@Lazy, @Autowired})
@RequestMapping(value = "api/folhasdepagamentos")
@Transactional
@Slf4j
public class FolhaDePagamentoResource {
    
    private final FolhaDePagamentoService service;

    @GetMapping
    @Timed
    public ResponseEntity<List<FolhaDePagamentoDTO>> listarTodos() {
        log.debug("Requisição REST para listar Folhas de Pagamento");
        return ResponseEntity.ok(this.service.listarTodos());
    }

    @GetMapping("/{id}")
    @Timed
    public ResponseEntity<FolhaDePagamentoDTO> buscarPorID(@PathVariable("id") Long id) {
        log.debug("Requisição REST para buscar Folha de Pagamento por id: {}", id);
        return ResponseEntity.ok(this.service.buscarPorID(id));
    }
}
