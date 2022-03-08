package com.cms.movie.dao;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.cms.movie.entity.MovieEsEntity;
@Repository
public interface MovieRepository extends ElasticsearchRepository<MovieEsEntity, String>{ 
	
	List<MovieEsEntity> findByTitle(String title);

	List<MovieEsEntity> findByActors(String actors);


}
