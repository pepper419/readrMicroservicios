package com.monaschinas.readr.saga.mapping;

import com.monaschinas.readr.shared.mapping.EnhancedModelMapper;
import com.monaschinas.readr.saga.domain.model.SagaStatus;
import com.monaschinas.readr.saga.resource.CreateSagaStatusResource;
import com.monaschinas.readr.saga.resource.SagaStatusResource;
import com.monaschinas.readr.saga.resource.UpdateSagaStatusResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class SagaStatusMapper {
    @Autowired
    EnhancedModelMapper mapper;
    public SagaStatusResource toResource(SagaStatus model) { return mapper.map(model, SagaStatusResource.class); }
    public Page<SagaStatusResource> modelListPage(List<SagaStatus> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, SagaStatusResource.class), pageable, modelList.size());
    }
    public SagaStatus toModel(CreateSagaStatusResource resource) { return mapper.map(resource, SagaStatus.class); }
    public SagaStatus toModel(UpdateSagaStatusResource resource) { return mapper.map(resource, SagaStatus.class); }
}
