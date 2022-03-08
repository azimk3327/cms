package com.cms.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.movie.beans.GenericResponse;
import com.cms.movie.beans.MovieCreateRequest;
import com.cms.movie.dao.MovieRepository;
import com.cms.movie.entity.MovieEsEntity;

@Service
public class MovieServiceImp implements MovieService{
	@Autowired
	MovieRepository movierepository;
	@Override
	public GenericResponse add(MovieCreateRequest request) {
		GenericResponse response=new GenericResponse();
		MovieEsEntity movieEsEntity=new MovieEsEntity();
		movieEsEntity.setName(request.getName());
		movieEsEntity.setTitle(request.getTitle());
		movieEsEntity.setShortDescription(request.getShortDescription());
		movieEsEntity.setDescription(request.getDescription());
		movieEsEntity.setLanguage(request.getLanguage());
		movieEsEntity.setTimeSlot(request.getTimeSlot());
		movieEsEntity.setActors(request.getActors());
		movieEsEntity.setActress(request.getActress());
		movieEsEntity.setMeta(request.getMeta());
		movieEsEntity.setTag(request.getTag());
		movieEsEntity.setReleaseDate(request.getReleaseDate());
		movieEsEntity.setBanner(request.getBanner());
	
		
		try {
		movierepository.save(movieEsEntity);
		response.setStatus("SUCESS");
		}catch(Exception e) {
			response.setStatus("FAILURE");
			response.setReason(e.getMessage());
		}
		return response;
	}
	public List<MovieEsEntity> get(String title) {
		List<MovieEsEntity> list =movierepository.findByTitle(title);
		return list;
			}



}
