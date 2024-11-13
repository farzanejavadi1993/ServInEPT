package com.example.servinelectro.domain.repo

import com.example.servinelectro.domain.entity.ProductEntity

interface ProductRepositoryInterface {
    fun getProduct () : ProductEntity
    fun addProductToFave(productEntity: ProductEntity)
}