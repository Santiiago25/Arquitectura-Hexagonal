package com.hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class AdditionalTaskInfo {
    //inmutabilidad de los objetos
    private final Long userId;
    private final String userName;
    private final String userEmail;

}
