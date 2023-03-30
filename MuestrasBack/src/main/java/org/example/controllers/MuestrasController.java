package org.example.controllers;

import Models.Muestra;
import Repositories.MuestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class MuestrasController {

    @Autowired
    private MuestraRepository muestraRepo;

    /**
     *
     * @param codMuestra the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{codMuestra}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Muestra findMuestra(@PathVariable String codMuestra) {
        return muestraRepo.findByCodMuestra(codMuestra);
    }

    @GetMapping("/all")
    public List<Muestra> findAll()
    {
        return muestraRepo.findAll();
    }
}
