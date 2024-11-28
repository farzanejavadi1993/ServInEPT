package com.example.servinelectro.data.repo

import com.example.servinelectro.data.mapper.mapToInvoiceEntity
import com.example.servinelectro.data.mapper.mapToInvoiceLocal
import com.example.servinelectro.data.source.local.Local
import com.example.servinelectro.data.source.remote.Remote
import com.example.servinelectro.domain.entity.InvoiceEntity
import com.example.servinelectro.domain.repo.InvoiceRepositoryInterface


class InvoiceRepositoryImpl(private val local: Local, private val remote: Remote) :
    InvoiceRepositoryInterface {


    override fun getInvoice(): InvoiceEntity {
        val invoiceRemote = remote.getInvoice()
        local.insertInvoice(invoiceRemote.mapToInvoiceLocal())
        val invoiceLocal = local.getInvoice()

        return invoiceLocal.mapToInvoiceEntity()
    }


}