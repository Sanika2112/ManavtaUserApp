package com.sanika.manavtauser
class DataClass {

    var dataNGO: String?=null
    var dataFounder: String?=null
    var dataDescription: String?=null
    var dataContact: String?=null
    var dataAddress: String?=null
    var dataEmail: String?=null
    var dataWebsite: String?=null
    var dataDonate:String?=null
    var dataImage: String?=null
    var key:String?=null

    constructor(dataNGO: String?, dataFounder: String?, dataDescription: String?, dataContact: String?, dataAddress: String?, dataEmail: String?, dataWebsite: String?,dataDonate:String?, dataImage: String?) {
        this.dataNGO = dataNGO
        this.dataFounder = dataFounder
        this.dataDescription = dataDescription
        this.dataContact = dataContact
        this.dataAddress = dataAddress
        this.dataEmail = dataEmail
        this.dataWebsite = dataWebsite
        this.dataDonate=dataDonate
        this.dataImage = dataImage

        this.key=key
    }

    constructor(){

    }

}