package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Joueur;
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
	
	// Update Controller
	@PutMapping(value = "/updateTerrain/{idT}")
	public Terrain updateTerrain(@RequestBody Terrain terrain, @PathVariable("idT") Long id) {		
		return terrainServ.updateTerrain(terrain, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deleteTerrain/{idT}")
	public void deleteTerrain(@PathVariable("idT") Long id) {
		terrainServ.deleteTerrain(id);
	}
}
