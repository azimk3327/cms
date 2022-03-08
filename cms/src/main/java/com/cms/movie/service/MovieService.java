package com.cms.movie.service;

import java.util.List;

import com.cms.movie.beans.GenericResponse;
import com.cms.movie.beans.MovieCreateRequest;
import com.cms.movie.entity.MovieEsEntity;

public interface MovieService {
	GenericResponse add(MovieCreateRequest request);
	List<MovieEsEntity> get(String title);
	

}
