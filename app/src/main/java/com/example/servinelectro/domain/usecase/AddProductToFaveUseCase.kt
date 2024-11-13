package com.example.servinelectro.domain.usecase

import com.example.servinelectro.domain.entity.ProductEntity
import com.example.servinelectro.domain.repo.ProductRepositoryInterface

class AddProductToFaveUseCase(private val repositoryInterface: ProductRepositoryInterface) {

    fun invoke(productEntity: ProductEntity) {
        repositoryInterface.addProductToFave(productEntity)
    }

}