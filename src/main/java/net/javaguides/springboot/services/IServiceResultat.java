package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.ResultatsTournois;

public interface IServiceResultat {
	public ResultatsTournois addResultat(ResultatsTournois resultat);
	public List<ResultatsTournois> addListResultat(List<ResultatsTournois> listResultat);
}
