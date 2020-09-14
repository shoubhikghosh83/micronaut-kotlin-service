package com.tech.ms.service

import javax.inject.Singleton
import com.tech.ms.model.Customer

@Singleton
class BaseService {
	
	
	fun getCustomer(): Customer
	{
		return Customer()
	}
}