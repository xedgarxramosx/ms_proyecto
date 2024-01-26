package com.example.ms_gestion.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("api/categorias")
@Getter
@Setter
@RefreshScope
public class CategoriaController {

	@Value("${app.testPropiedad}")
	private String testPropiedad;
	
	@GetMapping("/test")
	public String leerContenidoTestPropiedad() {
		return this.testPropiedad;
	}
}



