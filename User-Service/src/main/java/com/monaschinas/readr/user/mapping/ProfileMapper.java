package com.monaschinas.readr.user.mapping;

import com.monaschinas.readr.user.domain.model.Profile;
import com.monaschinas.readr.user.resource.CreateProfileResource;
import com.monaschinas.readr.user.resource.ProfileResource;
import com.monaschinas.readr.user.resource.UpdateProfileResource;
import com.monaschinas.readr.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class ProfileMapper implements Serializable {
  @Autowired
  private EnhancedModelMapper mapper;

  public ProfileResource toResource(Profile model) {
    return mapper.map(model, ProfileResource.class);
  }

  public Profile toModel(CreateProfileResource resource) {
    return mapper.map(resource, Profile.class);
  }

  public Profile toModel(UpdateProfileResource resource) {
    return mapper.map(resource, Profile.class);
  }

  public Page<ProfileResource> modelListPage(List<Profile> modelList, Pageable pageable) {
    return new PageImpl<>(mapper.mapList(modelList, ProfileResource.class), pageable, modelList.size());
  }
}
