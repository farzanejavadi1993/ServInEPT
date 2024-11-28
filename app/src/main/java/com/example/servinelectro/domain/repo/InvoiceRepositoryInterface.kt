package com.example.servinelectro.domain.repo

import com.example.servinelectro.domain.entity.InvoiceEntity

interface InvoiceRepositoryInterface {
    fun getInvoice () : InvoiceEntity
}