package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
