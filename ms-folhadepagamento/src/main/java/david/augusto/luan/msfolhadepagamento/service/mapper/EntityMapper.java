package david.augusto.luan.msfolhadepagamento.service.mapper;

import java.util.List;

public interface EntityMapper<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> dtoList);

    List<D> toDTOList(List<E> entityList);
}

