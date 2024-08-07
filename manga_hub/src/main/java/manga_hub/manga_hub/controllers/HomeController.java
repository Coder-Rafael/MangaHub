package manga_hub.manga_hub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import manga_hub.manga_hub.DTO.HomeDTO;
import manga_hub.manga_hub.Services.HomeService;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "*")
public class HomeController {

    @Autowired
    HomeService service;

    @GetMapping("/")
    public List<HomeDTO> listHome() {
        return service.listLast();
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<List<HomeDTO>> listPerSection(@PathVariable String tipo ) {
        return ResponseEntity.ok(service.listItensPerSection(tipo));
    }
}
