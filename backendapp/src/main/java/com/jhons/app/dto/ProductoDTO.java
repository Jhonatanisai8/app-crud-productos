package com.jhons.app.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

  private Long id;

  @NotBlank(message = "El nombre es obligatorio")
  private String nombre;

  @NotBlank(message = "La categoría es obligatoria")
  private String categoria;

  @Min(value = 0, message = "El stock no puede ser negativo")
  private Integer stock;

  @Positive(message = "El precio debe ser mayor a 0")
  private Double precio;
}
