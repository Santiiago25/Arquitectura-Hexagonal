package com.hexagonal.application.usecases;

import com.hexagonal.domain.model.AdditionalTaskInfo;
import com.hexagonal.domain.ports.in.GetAdditionalTaskUseCase;
import com.hexagonal.domain.ports.out.ExternalServicePort;
import org.springframework.beans.factory.annotation.Autowired;

public class GetAdditionalTaskUseCaseImpl implements GetAdditionalTaskUseCase {

    @Autowired
    private ExternalServicePort externalServicePort;

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
