package com.sistemas.microservicios.app.examenes.services;

import java.util.List;

import com.sistemas.microservicios.commons.examenes.models.entity.Asignatura;
import com.sistemas.microservicios.commons.examenes.models.entity.Examen;
import com.sistemas.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{
	
	public List<Examen> findByNombre(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();
	
	public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
