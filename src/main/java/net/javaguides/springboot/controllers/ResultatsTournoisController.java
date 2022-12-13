package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.ResultatsTournois;
import net.javaguides.springboot.services.ResultatServImpl;

@RestController
public class ResultatsTournoisController {

	@Autowired
	ResultatServImpl resultatServ;
	
	@PostMapping(value = "/addResultat")
	public ResultatsTournois addResultat(@RequestBody ResultatsTournois resultat) {
		return resultatServ.addResultat(resultat);
	}
	
	@PostMapping(value = "/addListResultat")
	public List<ResultatsTournois> addResultat(@RequestBody List<ResultatsTournois> listResultat) {
		return resultatServ.addListResultat(listResultat);
	}
	
}
