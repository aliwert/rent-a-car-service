package com.alimert.controller.impl;

import com.alimert.controller.BaseController;
import com.alimert.controller.IGalleristController;
import com.alimert.controller.RootEntity;
import com.alimert.dto.DtoGallerist;
import com.alimert.dto.DtoGalleristIU;
import com.alimert.service.IGalleristService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Override
    @GetMapping("/list")
    public RootEntity<List<DtoGallerist>> getAllGallerist() {
        return ok(galleristService.getAllGallerist());
    }

    @Override
    @GetMapping("/list/{id}")
    public RootEntity<DtoGallerist> findGalleristById(@PathVariable(name = "id") Long id) {
        return ok(galleristService.getGalleristById(id));
    }

    @Override
    @PutMapping("/update/{id}")
    public RootEntity<DtoGallerist> updateGallerist(@PathVariable(name = "id") Long id, @RequestBody DtoGalleristIU dtoGalleristIU) {
        return ok(galleristService.updateGallerist(id, dtoGalleristIU));
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public RootEntity<Void> deleteGallerist(@PathVariable(name = "id") Long id) {
        galleristService.deleteGallerist(id);
        return ok(null);
    }
}
