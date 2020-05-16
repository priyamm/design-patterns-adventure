package com.priyam.converter;

import java.util.function.Function;

public class Converter<T, R>  {
	private final Function<T, R> fromEntity;
	private final Function<R, T> fromDTO;

	public Converter(final Function<T, R> fromEntity, final Function<R, T> fromDTO) {
		this.fromEntity = fromEntity;
		this.fromDTO = fromDTO;
	}

	public R getDTOFromEntity(T t) {
		return fromEntity.apply(t);
	}

	public T getEntityFromDTO(R r) {
		return fromDTO.apply(r);
	}

}
