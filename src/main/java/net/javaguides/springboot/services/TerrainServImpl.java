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

	@Override
	public Terrain updateTerrain(Terrain terrain, Long id) {
		Terrain tr = terrainRep.findById(id).get();
		tr.setNomTerrain(terrain.getNomTerrain());
		tr.setResponsable(terrain.getResponsable());
		tr.setTelephone(terrain.getTelephone());
		tr.setCite(terrain.getCite());
		tr.setVille(terrain.getVille());
		
		return terrainRep.save(tr);
	}

	@Override
	public void deleteTerrain(Long idTerrain) {
		terrainRep.deleteById(idTerrain);
		
	}

}
