package com.example.servinelectro.data.repo

import com.example.servinelectro.data.mapper.mapToInvoiceEntity
import com.example.servinelectro.data.mapper.mapToInvoiceLocal
import com.example.servinelectro.data.mapper.mapToProductLocal
import com.example.servinelectro.data.mapper.mapToProductEntity
import com.example.servinelectro.data.source.local.Local
import com.example.servinelectro.data.source.remote.Remote
import com.example.servinelectro.domain.entity.InvoiceEntity
import com.example.servinelectro.domain.entity.ProductEntity
import com.example.servinelectro.domain.repo.ProductRepositoryInterface

class ProductRepositoryImpl(private val local: Local, private val remote: Remote) :
    ProductRepositoryInterface {

    override fun getProduct(): ProductEntity {
        val productRemote = remote.getProduct()
        local.insertProduct(productRemote.mapToProductLocal())
        val productLocal = local.getProduct()

        return productLocal.mapToProductEntity()
    }

    override fun addProductToFave(productEntity: ProductEntity) {
        local.addProductToFave(productEntity.mapToProductLocal())
    }



}