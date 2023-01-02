package com.servicesoup.spring.endpint;

import com.servicesoup.spring.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.tempuri.purchaseorderschema.PurchaseOrderType;

@Endpoint
public class PurchaseOrderEndpoint {

	private static final String LOCAL_PART = "PurchaseOrderType";
	private static final String NAMESPACE = "http://tempuri.org/PurchaseOrderSchema.xsd";

	@Autowired
	private PurchaseOrderService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = LOCAL_PART)
	@ResponsePayload
	public String getPurchaseOrder(@RequestPayload PurchaseOrderType order) {
		return service.savePurchaseOrder(order);
	}
}
