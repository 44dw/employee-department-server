package com.dw.employeedepartmentserver.mapper;

import com.dw.departmentdictionary.mapper.CommonMapper;
import com.dw.employeedepartmentserver.domain.Position;
import com.dw.employeedepartmentserver.dto.PositionDto;
import org.springframework.stereotype.Component;

@Component
public class PositionMapper implements CommonMapper<Position, PositionDto> {
    @Override
    public Position mapToDomain(PositionDto positionDto) {
        return new Position(positionDto.getId(), positionDto.getName());
    }

    @Override
    public PositionDto mapToDto(Position position) {
        return new PositionDto(position.getId(), position.getName());
    }
}
