package com.map;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorMapper {

	DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);
	@Mapping(source = "id", target = "emp_id")
    DoctorDto toDto(Doctor doctor);
}
