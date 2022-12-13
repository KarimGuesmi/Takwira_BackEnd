package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Terrain;

public interface IServiceTerrain {
	public Terrain addTerrain(Terrain terrain);
	public List<Terrain> addListTerrain(List<Terrain> listTerrain);
}
