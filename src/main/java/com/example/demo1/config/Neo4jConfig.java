package com.example.demo1.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories(basePackages = "com.example.demo1.repository")
public class Neo4jConfig {
}
