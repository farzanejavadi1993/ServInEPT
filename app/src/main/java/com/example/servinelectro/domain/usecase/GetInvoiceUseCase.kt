package com.example.servinelectro.domain.usecase

import com.example.servinelectro.domain.repo.InvoiceRepositoryInterface


class GetInvoiceUseCase(private val invoiceRepositoryInterface: InvoiceRepositoryInterface) {

    fun invoke() {
        invoiceRepositoryInterface.getInvoice()
    }

}