package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Terrain;
import net.javaguides.springboot.services.TerrainServImpl;

@RestController
public class TerrainController {

	@Autowired
	TerrainServImpl terrainServ;
	
	@PostMapping(value = "/addTerrain")
	public Terrain addTerrain(@RequestBody Terrain terrain) {
		return terrainServ.addTerrain(terrain);
	}
	
	@PostMapping(value = "/addListTerrain")
	public List<Terrain> addTerrain(@RequestBody List<Terrain> listTerrain) {
		return terrainServ.addListTerrain(listTerrain);
	}
}
