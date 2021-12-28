package david.augusto.luan.msfuncionario.repository;

import david.augusto.luan.msfuncionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


}
