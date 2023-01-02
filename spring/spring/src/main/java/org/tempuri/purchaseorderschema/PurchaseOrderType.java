//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2023.01.01 às 10:15:35 PM BRT 
//


package org.tempuri.purchaseorderschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Classe Java de PurchaseOrderType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipTo" type="{http://tempuri.org/PurchaseOrderSchema.xsd}USAddress" maxOccurs="2"/&gt;
 *         &lt;element name="BillTo" type="{http://tempuri.org/PurchaseOrderSchema.xsd}USAddress"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseOrderType", propOrder = {
    "shipTo",
    "billTo"
})
@XmlRootElement(name = "PurchaseOrderType")
public class PurchaseOrderType {

    @XmlElement(name = "ShipTo", required = true)
    protected List<USAddress> shipTo;
    @XmlElement(name = "BillTo", required = true)
    protected USAddress billTo;
    @XmlAttribute(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;

    /**
     * Gets the value of the shipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USAddress }
     * 
     * 
     */
    public List<USAddress> getShipTo() {
        if (shipTo == null) {
            shipTo = new ArrayList<USAddress>();
        }
        return this.shipTo;
    }

    /**
     * Obtém o valor da propriedade billTo.
     * 
     * @return
     *     possible object is
     *     {@link USAddress }
     *     
     */
    public USAddress getBillTo() {
        return billTo;
    }

    /**
     * Define o valor da propriedade billTo.
     * 
     * @param value
     *     allowed object is
     *     {@link USAddress }
     *     
     */
    public void setBillTo(USAddress value) {
        this.billTo = value;
    }

    /**
     * Obtém o valor da propriedade orderDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Define o valor da propriedade orderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

}
