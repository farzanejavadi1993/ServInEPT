package com.example.servinelectro.data.mapper

import com.example.servinelectro.data.source.local.InvoiceLocal
import com.example.servinelectro.data.source.local.ProductLocal
import com.example.servinelectro.data.source.remote.InvoiceRemote
import com.example.servinelectro.data.source.remote.ProductRemote
import com.example.servinelectro.domain.entity.InvoiceEntity
import com.example.servinelectro.domain.entity.ProductEntity

fun ProductRemote.mapToProductLocal() : ProductLocal {
    return ProductLocal(id=id)
}

fun ProductLocal.mapToProductEntity() : ProductEntity {
    return ProductEntity(id=id)
}

fun ProductEntity.mapToProductLocal() : ProductLocal {
    return ProductLocal(id=id)
}

fun InvoiceRemote.mapToInvoiceLocal() : InvoiceLocal {
    return InvoiceLocal(id=id , number=number)
}

fun InvoiceLocal.mapToInvoiceEntity (): InvoiceEntity {
    return InvoiceEntity(id=id , number=number)
}