package com.anibal.busapi;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    // Endpoint con paginación
    @GetMapping
    public Page<Bus> getAllBuses(
        @RequestParam(defaultValue = "0") int page,  // Página por defecto es 0
        @RequestParam(defaultValue = "10") int size  // Tamaño por defecto es 10
    ) {
        return busService.getBusesPage(page, size);
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }
}
