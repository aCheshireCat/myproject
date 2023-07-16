
package com.wk.project.webservice.info.erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_OM_OMS2_DELX1798393X1X16 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_OM_OMS2_DELX1798393X1X16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORGCODE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ORDERNUMBER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string50" minOccurs="0"/&gt;
 *         &lt;element name="OMSORDERNUMBER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERYNUMBER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SHIPDATE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="CUSTACCOUNT" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESSID" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ORDERTYPE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="FREIGHTTERMS" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SHIPPINGMETHOD" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="TERMNAME" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="LOADINGPORT" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="DESTINATIONPORT" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SHIPFROMFACTORY" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="CUSTPONUMBER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SALESREP" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="PROJECTNUMBER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ORDERCREATEDBY" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERYCREATEDBY" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SOURCESYSTEM" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="SOURCEREFERENCE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string120" minOccurs="0"/&gt;
 *         &lt;element name="SOURCELINEID" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string80" minOccurs="0"/&gt;
 *         &lt;element name="ATTR1" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR2" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR3" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR4" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR5" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR6" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR7" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR8" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR9" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR10" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR11" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR12" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR13" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR14" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR15" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="LINES" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DELX1798393X1X55" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_OM_OMS2_DELX1798393X1X16", propOrder = {
    "orgcode",
    "ordernumber",
    "omsordernumber",
    "deliverynumber",
    "shipdate",
    "custaccount",
    "addressid",
    "ordertype",
    "freightterms",
    "currency",
    "shippingmethod",
    "termname",
    "loadingport",
    "destinationport",
    "shipfromfactory",
    "custponumber",
    "salesrep",
    "projectnumber",
    "ordercreatedby",
    "deliverycreatedby",
    "sourcesystem",
    "sourcereference",
    "sourcelineid",
    "attr1",
    "attr2",
    "attr3",
    "attr4",
    "attr5",
    "attr6",
    "attr7",
    "attr8",
    "attr9",
    "attr10",
    "attr11",
    "attr12",
    "attr13",
    "attr14",
    "attr15",
    "lines"
})
public class APPSCUXOMOMS2DELX1798393X1X16 {

    @XmlElementRef(name = "ORGCODE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgcode;
    @XmlElementRef(name = "ORDERNUMBER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ordernumber;
    @XmlElementRef(name = "OMSORDERNUMBER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omsordernumber;
    @XmlElementRef(name = "DELIVERYNUMBER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverynumber;
    @XmlElementRef(name = "SHIPDATE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipdate;
    @XmlElementRef(name = "CUSTACCOUNT", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custaccount;
    @XmlElementRef(name = "ADDRESSID", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressid;
    @XmlElementRef(name = "ORDERTYPE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ordertype;
    @XmlElementRef(name = "FREIGHTTERMS", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freightterms;
    @XmlElementRef(name = "CURRENCY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "SHIPPINGMETHOD", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shippingmethod;
    @XmlElementRef(name = "TERMNAME", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termname;
    @XmlElementRef(name = "LOADINGPORT", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadingport;
    @XmlElementRef(name = "DESTINATIONPORT", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationport;
    @XmlElementRef(name = "SHIPFROMFACTORY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipfromfactory;
    @XmlElementRef(name = "CUSTPONUMBER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custponumber;
    @XmlElementRef(name = "SALESREP", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesrep;
    @XmlElementRef(name = "PROJECTNUMBER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectnumber;
    @XmlElementRef(name = "ORDERCREATEDBY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ordercreatedby;
    @XmlElementRef(name = "DELIVERYCREATEDBY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverycreatedby;
    @XmlElementRef(name = "SOURCESYSTEM", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourcesystem;
    @XmlElementRef(name = "SOURCEREFERENCE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourcereference;
    @XmlElementRef(name = "SOURCELINEID", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourcelineid;
    @XmlElementRef(name = "ATTR1", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr1;
    @XmlElementRef(name = "ATTR2", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr2;
    @XmlElementRef(name = "ATTR3", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr3;
    @XmlElementRef(name = "ATTR4", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr4;
    @XmlElementRef(name = "ATTR5", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr5;
    @XmlElementRef(name = "ATTR6", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr6;
    @XmlElementRef(name = "ATTR7", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr7;
    @XmlElementRef(name = "ATTR8", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr8;
    @XmlElementRef(name = "ATTR9", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr9;
    @XmlElementRef(name = "ATTR10", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr10;
    @XmlElementRef(name = "ATTR11", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr11;
    @XmlElementRef(name = "ATTR12", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr12;
    @XmlElementRef(name = "ATTR13", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr13;
    @XmlElementRef(name = "ATTR14", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr14;
    @XmlElementRef(name = "ATTR15", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attr15;
    @XmlElementRef(name = "LINES", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<APPSCUXOMOMS2DELX1798393X1X55> lines;

    /**
     * ��ȡorgcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORGCODE() {
        return orgcode;
    }

    /**
     * ����orgcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORGCODE(JAXBElement<String> value) {
        this.orgcode = value;
    }

    /**
     * ��ȡordernumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORDERNUMBER() {
        return ordernumber;
    }

    /**
     * ����ordernumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORDERNUMBER(JAXBElement<String> value) {
        this.ordernumber = value;
    }

    /**
     * ��ȡomsordernumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOMSORDERNUMBER() {
        return omsordernumber;
    }

    /**
     * ����omsordernumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOMSORDERNUMBER(JAXBElement<String> value) {
        this.omsordernumber = value;
    }

    /**
     * ��ȡdeliverynumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELIVERYNUMBER() {
        return deliverynumber;
    }

    /**
     * ����deliverynumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELIVERYNUMBER(JAXBElement<String> value) {
        this.deliverynumber = value;
    }

    /**
     * ��ȡshipdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHIPDATE() {
        return shipdate;
    }

    /**
     * ����shipdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHIPDATE(JAXBElement<String> value) {
        this.shipdate = value;
    }

    /**
     * ��ȡcustaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUSTACCOUNT() {
        return custaccount;
    }

    /**
     * ����custaccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUSTACCOUNT(JAXBElement<String> value) {
        this.custaccount = value;
    }

    /**
     * ��ȡaddressid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRESSID() {
        return addressid;
    }

    /**
     * ����addressid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRESSID(JAXBElement<String> value) {
        this.addressid = value;
    }

    /**
     * ��ȡordertype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORDERTYPE() {
        return ordertype;
    }

    /**
     * ����ordertype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORDERTYPE(JAXBElement<String> value) {
        this.ordertype = value;
    }

    /**
     * ��ȡfreightterms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFREIGHTTERMS() {
        return freightterms;
    }

    /**
     * ����freightterms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFREIGHTTERMS(JAXBElement<String> value) {
        this.freightterms = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCURRENCY() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCURRENCY(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * ��ȡshippingmethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHIPPINGMETHOD() {
        return shippingmethod;
    }

    /**
     * ����shippingmethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHIPPINGMETHOD(JAXBElement<String> value) {
        this.shippingmethod = value;
    }

    /**
     * ��ȡtermname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTERMNAME() {
        return termname;
    }

    /**
     * ����termname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTERMNAME(JAXBElement<String> value) {
        this.termname = value;
    }

    /**
     * ��ȡloadingport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOADINGPORT() {
        return loadingport;
    }

    /**
     * ����loadingport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOADINGPORT(JAXBElement<String> value) {
        this.loadingport = value;
    }

    /**
     * ��ȡdestinationport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESTINATIONPORT() {
        return destinationport;
    }

    /**
     * ����destinationport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESTINATIONPORT(JAXBElement<String> value) {
        this.destinationport = value;
    }

    /**
     * ��ȡshipfromfactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHIPFROMFACTORY() {
        return shipfromfactory;
    }

    /**
     * ����shipfromfactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHIPFROMFACTORY(JAXBElement<String> value) {
        this.shipfromfactory = value;
    }

    /**
     * ��ȡcustponumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUSTPONUMBER() {
        return custponumber;
    }

    /**
     * ����custponumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUSTPONUMBER(JAXBElement<String> value) {
        this.custponumber = value;
    }

    /**
     * ��ȡsalesrep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSALESREP() {
        return salesrep;
    }

    /**
     * ����salesrep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSALESREP(JAXBElement<String> value) {
        this.salesrep = value;
    }

    /**
     * ��ȡprojectnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROJECTNUMBER() {
        return projectnumber;
    }

    /**
     * ����projectnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROJECTNUMBER(JAXBElement<String> value) {
        this.projectnumber = value;
    }

    /**
     * ��ȡordercreatedby���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORDERCREATEDBY() {
        return ordercreatedby;
    }

    /**
     * ����ordercreatedby���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORDERCREATEDBY(JAXBElement<String> value) {
        this.ordercreatedby = value;
    }

    /**
     * ��ȡdeliverycreatedby���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELIVERYCREATEDBY() {
        return deliverycreatedby;
    }

    /**
     * ����deliverycreatedby���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELIVERYCREATEDBY(JAXBElement<String> value) {
        this.deliverycreatedby = value;
    }

    /**
     * ��ȡsourcesystem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOURCESYSTEM() {
        return sourcesystem;
    }

    /**
     * ����sourcesystem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOURCESYSTEM(JAXBElement<String> value) {
        this.sourcesystem = value;
    }

    /**
     * ��ȡsourcereference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOURCEREFERENCE() {
        return sourcereference;
    }

    /**
     * ����sourcereference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOURCEREFERENCE(JAXBElement<String> value) {
        this.sourcereference = value;
    }

    /**
     * ��ȡsourcelineid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOURCELINEID() {
        return sourcelineid;
    }

    /**
     * ����sourcelineid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOURCELINEID(JAXBElement<String> value) {
        this.sourcelineid = value;
    }

    /**
     * ��ȡattr1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR1() {
        return attr1;
    }

    /**
     * ����attr1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR1(JAXBElement<String> value) {
        this.attr1 = value;
    }

    /**
     * ��ȡattr2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR2() {
        return attr2;
    }

    /**
     * ����attr2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR2(JAXBElement<String> value) {
        this.attr2 = value;
    }

    /**
     * ��ȡattr3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR3() {
        return attr3;
    }

    /**
     * ����attr3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR3(JAXBElement<String> value) {
        this.attr3 = value;
    }

    /**
     * ��ȡattr4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR4() {
        return attr4;
    }

    /**
     * ����attr4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR4(JAXBElement<String> value) {
        this.attr4 = value;
    }

    /**
     * ��ȡattr5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR5() {
        return attr5;
    }

    /**
     * ����attr5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR5(JAXBElement<String> value) {
        this.attr5 = value;
    }

    /**
     * ��ȡattr6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR6() {
        return attr6;
    }

    /**
     * ����attr6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR6(JAXBElement<String> value) {
        this.attr6 = value;
    }

    /**
     * ��ȡattr7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR7() {
        return attr7;
    }

    /**
     * ����attr7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR7(JAXBElement<String> value) {
        this.attr7 = value;
    }

    /**
     * ��ȡattr8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR8() {
        return attr8;
    }

    /**
     * ����attr8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR8(JAXBElement<String> value) {
        this.attr8 = value;
    }

    /**
     * ��ȡattr9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR9() {
        return attr9;
    }

    /**
     * ����attr9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR9(JAXBElement<String> value) {
        this.attr9 = value;
    }

    /**
     * ��ȡattr10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR10() {
        return attr10;
    }

    /**
     * ����attr10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR10(JAXBElement<String> value) {
        this.attr10 = value;
    }

    /**
     * ��ȡattr11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR11() {
        return attr11;
    }

    /**
     * ����attr11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR11(JAXBElement<String> value) {
        this.attr11 = value;
    }

    /**
     * ��ȡattr12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR12() {
        return attr12;
    }

    /**
     * ����attr12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR12(JAXBElement<String> value) {
        this.attr12 = value;
    }

    /**
     * ��ȡattr13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR13() {
        return attr13;
    }

    /**
     * ����attr13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR13(JAXBElement<String> value) {
        this.attr13 = value;
    }

    /**
     * ��ȡattr14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR14() {
        return attr14;
    }

    /**
     * ����attr14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR14(JAXBElement<String> value) {
        this.attr14 = value;
    }

    /**
     * ��ȡattr15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTR15() {
        return attr15;
    }

    /**
     * ����attr15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTR15(JAXBElement<String> value) {
        this.attr15 = value;
    }

    /**
     * ��ȡlines���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELX1798393X1X55 }{@code >}
     *     
     */
    public JAXBElement<APPSCUXOMOMS2DELX1798393X1X55> getLINES() {
        return lines;
    }

    /**
     * ����lines���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELX1798393X1X55 }{@code >}
     *     
     */
    public void setLINES(JAXBElement<APPSCUXOMOMS2DELX1798393X1X55> value) {
        this.lines = value;
    }

}
