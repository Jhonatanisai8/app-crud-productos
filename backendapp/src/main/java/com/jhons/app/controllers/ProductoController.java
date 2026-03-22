package com.jhons.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhons.app.dto.ProductoDTO;
import com.jhons.app.service.ProductoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/productos")
@RequiredArgsConstructor
public class ProductoController {

  private final ProductoService productoService;

  @GetMapping
  public ResponseEntity<List<ProductoDTO>> obtenerTodos() {
    return ResponseEntity.ok(productoService.obtenerTodos());
  }

  @PostMapping
  public ResponseEntity<ProductoDTO> crear(@Valid @RequestBody ProductoDTO productoDTO) {
    return new ResponseEntity<>(productoService.crear(productoDTO), HttpStatus.CREATED);
  }

}    