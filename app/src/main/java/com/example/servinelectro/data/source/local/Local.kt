package com.example.servinelectro.data.source.local

class Local {

    fun getProduct(): ProductLocal {
        return ProductLocal("")
    }

    fun insertProduct(productLocal: ProductLocal) {}

    fun addProductToFave(productLocal: ProductLocal) {}


    fun getInvoice(): InvoiceLocal {
        return InvoiceLocal("",0)
    }
    fun insertInvoice(invoiceLocal: InvoiceLocal) {}
}