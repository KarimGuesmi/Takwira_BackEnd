package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ResultatsTournois;

public interface IServiceResultat {
	public ResultatsTournois addResultat(ResultatsTournois resultat);
	public List<ResultatsTournois> addListResultat(List<ResultatsTournois> listResultat);
	
	public ResultatsTournois updateResultat(ResultatsTournois resultat, Long id);
	public void deleteResultat(Long idResultat);
}
