package com.wisch096.cardapio.food;

public record FoodResponseDTO(Long id, String nome, String image, Integer preco) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getNome(), food.getImage(), food.getPreco());
    }
}
