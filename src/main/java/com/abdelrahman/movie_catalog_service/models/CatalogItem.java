package com.abdelrahman.movie_catalog_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogItem {
    private String name;
    private String description;
    private int rating;
}
