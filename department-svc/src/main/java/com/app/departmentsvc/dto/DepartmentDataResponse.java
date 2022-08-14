package com.app.departmentsvc.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class DepartmentDataResponse {
    private Long id;
    private String name;
    private String code;
    private String description;
}
