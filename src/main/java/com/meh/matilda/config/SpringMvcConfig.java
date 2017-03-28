package com.meh.matilda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

public class SpringMvcConfig {

    private static final String VIEWS_TILES = "/WEB-INF/views/tiles";
    
    @Bean
	public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{
               VIEWS_TILES+"/tiles-base.xml"
        });
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
	} 
	  
}
