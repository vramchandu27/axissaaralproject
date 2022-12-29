package com.AxisSaral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AxisSaral.model.Newsfeed;


@Repository
public interface NewsfeedRepository  extends JpaRepository<Newsfeed,Long>{

}
