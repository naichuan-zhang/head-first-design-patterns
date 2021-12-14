package com.naichuan.converter;

import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @param <D> Dto
 * @param <E> Entity
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
@RequiredArgsConstructor
public class Converter<D, E> {

    private final Function<D, E> fromDto;
    private final Function<E, D> fromEntity;

    public final E convertFromDto(final D dto) {
        return fromDto.apply(dto);
    }

    public final D convertFromEntity(final E entity) {
        return fromEntity.apply(entity);
    }

    public final List<E> createFromDtos(final Collection<D> dtos) {
        return dtos.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

    public final List<D> createFromEntities(final Collection<E> entities) {
        return entities.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }
}
