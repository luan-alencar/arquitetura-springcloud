package david.augusto.luan.msfuncionario.service;

import david.augusto.luan.msfuncionario.domain.Funcionario;
import david.augusto.luan.msfuncionario.repository.FuncionarioRepository;
import david.augusto.luan.msfuncionario.service.dto.FuncionarioDTO;
import david.augusto.luan.msfuncionario.service.mapper.FuncionarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;

    public List<FuncionarioDTO> listarTodos() {
        return this.mapper.toDTOList(this.repository.findAll());
    }

    public FuncionarioDTO buscarPorID(@PathVariable("id") Long id) {
        Funcionario funcionario = this.repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado! Tente novamente."));
        return this.mapper.toDTO(funcionario);
    }
}
