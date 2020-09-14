package com.tech.ms.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import com.tech.ms.service.BaseService
import com.tech.ms.model.Customer


@Controller("/api/v1")
class BaseController (private val service: BaseService){
	
	@Get("getHealth")
fun getHealth(): String{
		return "UP"
	}
	
	@Get("getCustomer")
fun getCustomer(): Customer
	{
		
		return service.getCustomer()
	}
	
}