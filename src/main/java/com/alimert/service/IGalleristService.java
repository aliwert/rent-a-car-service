package com.alimert.service;

import com.alimert.controller.RootEntity;
import com.alimert.dto.DtoGallerist;
import com.alimert.dto.DtoGalleristIU;

import java.util.List;

public interface IGalleristService {

    public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);

    public List<DtoGallerist> getAllGallerist();

    public DtoGallerist getGalleristById(Long id);

    public DtoGallerist updateGallerist(Long id, DtoGalleristIU dtoGalleristIU);

    public RootEntity<Void> deleteGallerist(Long id);
}
