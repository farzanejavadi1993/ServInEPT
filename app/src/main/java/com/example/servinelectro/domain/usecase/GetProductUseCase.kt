package com.example.servinelectro.domain.usecase

import com.example.servinelectro.domain.entity.ProductEntity
import com.example.servinelectro.domain.repo.ProductRepositoryInterface

class GetProductUseCase(private val repositoryInterface: ProductRepositoryInterface) {
    fun invoke(): ProductEntity = repositoryInterface.getProduct()

}