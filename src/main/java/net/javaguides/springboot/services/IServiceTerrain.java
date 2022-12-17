package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Terrain;

public interface IServiceTerrain {
	public Terrain addTerrain(Terrain terrain);
	public List<Terrain> addListTerrain(List<Terrain> listTerrain);
	
	public Terrain updateTerrain(Terrain terrain, Long id);
	public void deleteTerrain(Long idTerrain);
}
