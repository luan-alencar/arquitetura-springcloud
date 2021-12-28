package david.augusto.luan.msfolhadepagamento.repository;

import david.augusto.luan.msfolhadepagamento.domain.FolhaDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolhaDePagamentoRepository extends JpaRepository<FolhaDePagamento, Long> {
}
