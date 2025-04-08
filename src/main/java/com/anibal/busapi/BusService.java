
package com.anibal.busapi;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

//@Service
//public class BusService {
 //      @Autowired
  //  private BusRepository busRepository;

   // public List<Bus> getAllBuses() {
   //    return busRepository.findAll();
   // }

 //}
@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    // Método para obtener los buses con paginación
    public Page<Bus> getBusesPage(int page, int size) {
        return busRepository.findAll(PageRequest.of(page, size));
    }

    public Bus getBusById(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus no encontrado"));
    }
}