package com.alimert.controller.impl;

import com.alimert.controller.BaseController;
import com.alimert.controller.IGalleristController;
import com.alimert.controller.RootEntity;
import com.alimert.dto.DtoGallerist;
import com.alimert.dto.DtoGalleristIU;
import com.alimert.service.IGalleristService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/gallerist")
public class GalleristControllerImpl extends BaseController implements IGalleristController {


    @Autowired
    private IGalleristService galleristService;

    @PostMapping("/save")
    @Override
    public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {
        return ok(galleristService.saveGallerist(dtoGalleristIU));
    }
}
