package com.servicesoup.spring.service;

import org.springframework.stereotype.Service;
import org.tempuri.purchaseorderschema.PurchaseOrderType;

@Service
public class PurchaseOrderService {

	public String savePurchaseOrder(PurchaseOrderType orderType) {
		return "OK";
	}
}
