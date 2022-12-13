package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.Terrain;
import net.javaguides.springboot.repository.TerrainRepository;

@Service
public class TerrainServImpl implements IServiceTerrain{

	@Autowired
	TerrainRepository terrainRep;
	
	@Override
	public Terrain addTerrain(Terrain terrain) {
		return terrainRep.save(terrain);
	}

	@Override
	public List<Terrain> addListTerrain(List<Terrain> listTerrain) {
		return terrainRep.saveAll(listTerrain);
	}

}
