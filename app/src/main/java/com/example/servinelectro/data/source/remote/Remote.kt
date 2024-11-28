package com.example.servinelectro.data.source.remote

class Remote {

    fun getProduct() : ProductRemote{
        return ProductRemote("")
    }

    fun getInvoice() : InvoiceRemote{
        return InvoiceRemote("",0)
    }


}