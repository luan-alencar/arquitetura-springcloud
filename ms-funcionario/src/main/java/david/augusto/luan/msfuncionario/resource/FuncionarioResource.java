package david.augusto.luan.msfuncionario.resource;

import david.augusto.luan.msfuncionario.service.FuncionarioService;
import david.augusto.luan.msfuncionario.service.dto.FuncionarioDTO;
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
@RequestMapping(value = "api/funcionarios")
@Transactional
@Slf4j
public class FuncionarioResource {


    private final FuncionarioService service;

    @GetMapping
    @Timed
    public ResponseEntity<List<FuncionarioDTO>> listarTodos() {
        log.debug("Requisição REST para listar Funcionarios");
        return ResponseEntity.ok(this.service.listarTodos());
    }

    @GetMapping("/{id}")
    @Timed
    public ResponseEntity<FuncionarioDTO> buscarPorID(@PathVariable("id") Long id) {
        log.debug("Requisição REST para buscar Funcionario por id: {}", id);
        return ResponseEntity.ok(this.service.buscarPorID(id));
    }
}
