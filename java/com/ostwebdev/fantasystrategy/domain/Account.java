package com.ostwebdev.fantasystrategy.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Account {
	@GraphId private Long id;
	public int facebookID;
}
