package com.muratyildirim.spring_data_jpa.shared;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConvertModel {

	ModelMapper modelMapper;

	public ConvertModel(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public <T, D> Page<D> convertPage(Page<T> entities, Class<D> dtoClass) {
		return entities.map(entity -> modelMapper.map(entity, dtoClass));
	}

	public <T, D> D convertObject(T entity, Class<D> dtoClass) {
		return modelMapper.map(entity, dtoClass);
	}

	public <T, D> List<D> convertList(List<T> entities, Class<D> dtoClass) {
		return entities.stream().map(entity -> modelMapper.map(entity, dtoClass)).collect(Collectors.toList());
	}

}
