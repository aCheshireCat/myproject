
package com.wk.project.webservice.info.erp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_OM_OMS2_DELX1798393X1X56 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_OM_OMS2_DELX1798393X1X56"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ITEMCODE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string40" minOccurs="0"/&gt;
 *         &lt;element name="UNITWATTQUANTITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UNITWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WATTQUANTITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARYQUANTITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UNITOFMEASURE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="TAXRATE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="UNITSELLINGPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UNITMARKETWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UNITMARKETPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SCHEDULESHIPDATE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFERFLAG" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="LINETYPE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="TRADEPATH" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="BILLORGANIZATION" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="SETTLEORGANIZATION" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERYORGANIZATION" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="DTOSWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DTOSPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DTOSMARKETWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DTOSMARKETPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="STOBWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="STOBPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="STOBMARKETWATTPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="STOBMARKETPRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="COMMERCIALINVOICE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string100" minOccurs="0"/&gt;
 *         &lt;element name="SHIPPER" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="COMMERCIALINVOICEDATE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="REBATEFLAG" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_OM_OMS2_DELX1798393X1X56", propOrder = {
    "lineno",
    "itemcode",
    "unitwattquantity",
    "unitwattprice",
    "wattquantity",
    "primaryquantity",
    "unitofmeasure",
    "taxrate",
    "unitsellingprice",
    "unitmarketwattprice",
    "unitmarketprice",
    "scheduleshipdate",
    "transferflag",
    "linetype",
    "tradepath",
    "billorganization",
    "settleorganization",
    "deliveryorganization",
    "dtoswattprice",
    "dtosprice",
    "dtosmarketwattprice",
    "dtosmarketprice",
    "stobwattprice",
    "stobprice",
    "stobmarketwattprice",
    "stobmarketprice",
    "commercialinvoice",
    "shipper",
    "commercialinvoicedate",
    "rebateflag",
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
    "attr15"
})
public class APPSCUXOMOMS2DELX1798393X1X56 {

    @XmlElementRef(name = "LINENO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lineno;
    @XmlElementRef(name = "ITEMCODE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemcode;
    @XmlElementRef(name = "UNITWATTQUANTITY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitwattquantity;
    @XmlElementRef(name = "UNITWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitwattprice;
    @XmlElementRef(name = "WATTQUANTITY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> wattquantity;
    @XmlElementRef(name = "PRIMARYQUANTITY", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryquantity;
    @XmlElementRef(name = "UNITOFMEASURE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitofmeasure;
    @XmlElementRef(name = "TAXRATE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxrate;
    @XmlElementRef(name = "UNITSELLINGPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitsellingprice;
    @XmlElementRef(name = "UNITMARKETWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitmarketwattprice;
    @XmlElementRef(name = "UNITMARKETPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitmarketprice;
    @XmlElementRef(name = "SCHEDULESHIPDATE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scheduleshipdate;
    @XmlElementRef(name = "TRANSFERFLAG", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferflag;
    @XmlElementRef(name = "LINETYPE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linetype;
    @XmlElementRef(name = "TRADEPATH", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradepath;
    @XmlElementRef(name = "BILLORGANIZATION", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billorganization;
    @XmlElementRef(name = "SETTLEORGANIZATION", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settleorganization;
    @XmlElementRef(name = "DELIVERYORGANIZATION", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryorganization;
    @XmlElementRef(name = "DTOSWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dtoswattprice;
    @XmlElementRef(name = "DTOSPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dtosprice;
    @XmlElementRef(name = "DTOSMARKETWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dtosmarketwattprice;
    @XmlElementRef(name = "DTOSMARKETPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dtosmarketprice;
    @XmlElementRef(name = "STOBWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stobwattprice;
    @XmlElementRef(name = "STOBPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stobprice;
    @XmlElementRef(name = "STOBMARKETWATTPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stobmarketwattprice;
    @XmlElementRef(name = "STOBMARKETPRICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stobmarketprice;
    @XmlElementRef(name = "COMMERCIALINVOICE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialinvoice;
    @XmlElementRef(name = "SHIPPER", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipper;
    @XmlElementRef(name = "COMMERCIALINVOICEDATE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialinvoicedate;
    @XmlElementRef(name = "REBATEFLAG", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rebateflag;
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

    /**
     * ��ȡlineno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLINENO() {
        return lineno;
    }

    /**
     * ����lineno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLINENO(JAXBElement<BigDecimal> value) {
        this.lineno = value;
    }

    /**
     * ��ȡitemcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getITEMCODE() {
        return itemcode;
    }

    /**
     * ����itemcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setITEMCODE(JAXBElement<String> value) {
        this.itemcode = value;
    }

    /**
     * ��ȡunitwattquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUNITWATTQUANTITY() {
        return unitwattquantity;
    }

    /**
     * ����unitwattquantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUNITWATTQUANTITY(JAXBElement<BigDecimal> value) {
        this.unitwattquantity = value;
    }

    /**
     * ��ȡunitwattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUNITWATTPRICE() {
        return unitwattprice;
    }

    /**
     * ����unitwattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUNITWATTPRICE(JAXBElement<BigDecimal> value) {
        this.unitwattprice = value;
    }

    /**
     * ��ȡwattquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWATTQUANTITY() {
        return wattquantity;
    }

    /**
     * ����wattquantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWATTQUANTITY(JAXBElement<BigDecimal> value) {
        this.wattquantity = value;
    }

    /**
     * ��ȡprimaryquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPRIMARYQUANTITY() {
        return primaryquantity;
    }

    /**
     * ����primaryquantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPRIMARYQUANTITY(JAXBElement<BigDecimal> value) {
        this.primaryquantity = value;
    }

    /**
     * ��ȡunitofmeasure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUNITOFMEASURE() {
        return unitofmeasure;
    }

    /**
     * ����unitofmeasure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUNITOFMEASURE(JAXBElement<String> value) {
        this.unitofmeasure = value;
    }

    /**
     * ��ȡtaxrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTAXRATE() {
        return taxrate;
    }

    /**
     * ����taxrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTAXRATE(JAXBElement<String> value) {
        this.taxrate = value;
    }

    /**
     * ��ȡunitsellingprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUNITSELLINGPRICE() {
        return unitsellingprice;
    }

    /**
     * ����unitsellingprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUNITSELLINGPRICE(JAXBElement<BigDecimal> value) {
        this.unitsellingprice = value;
    }

    /**
     * ��ȡunitmarketwattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUNITMARKETWATTPRICE() {
        return unitmarketwattprice;
    }

    /**
     * ����unitmarketwattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUNITMARKETWATTPRICE(JAXBElement<BigDecimal> value) {
        this.unitmarketwattprice = value;
    }

    /**
     * ��ȡunitmarketprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUNITMARKETPRICE() {
        return unitmarketprice;
    }

    /**
     * ����unitmarketprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUNITMARKETPRICE(JAXBElement<BigDecimal> value) {
        this.unitmarketprice = value;
    }

    /**
     * ��ȡscheduleshipdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCHEDULESHIPDATE() {
        return scheduleshipdate;
    }

    /**
     * ����scheduleshipdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCHEDULESHIPDATE(JAXBElement<String> value) {
        this.scheduleshipdate = value;
    }

    /**
     * ��ȡtransferflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRANSFERFLAG() {
        return transferflag;
    }

    /**
     * ����transferflag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRANSFERFLAG(JAXBElement<String> value) {
        this.transferflag = value;
    }

    /**
     * ��ȡlinetype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLINETYPE() {
        return linetype;
    }

    /**
     * ����linetype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLINETYPE(JAXBElement<String> value) {
        this.linetype = value;
    }

    /**
     * ��ȡtradepath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRADEPATH() {
        return tradepath;
    }

    /**
     * ����tradepath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRADEPATH(JAXBElement<String> value) {
        this.tradepath = value;
    }

    /**
     * ��ȡbillorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBILLORGANIZATION() {
        return billorganization;
    }

    /**
     * ����billorganization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBILLORGANIZATION(JAXBElement<String> value) {
        this.billorganization = value;
    }

    /**
     * ��ȡsettleorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSETTLEORGANIZATION() {
        return settleorganization;
    }

    /**
     * ����settleorganization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSETTLEORGANIZATION(JAXBElement<String> value) {
        this.settleorganization = value;
    }

    /**
     * ��ȡdeliveryorganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELIVERYORGANIZATION() {
        return deliveryorganization;
    }

    /**
     * ����deliveryorganization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELIVERYORGANIZATION(JAXBElement<String> value) {
        this.deliveryorganization = value;
    }

    /**
     * ��ȡdtoswattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDTOSWATTPRICE() {
        return dtoswattprice;
    }

    /**
     * ����dtoswattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDTOSWATTPRICE(JAXBElement<BigDecimal> value) {
        this.dtoswattprice = value;
    }

    /**
     * ��ȡdtosprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDTOSPRICE() {
        return dtosprice;
    }

    /**
     * ����dtosprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDTOSPRICE(JAXBElement<BigDecimal> value) {
        this.dtosprice = value;
    }

    /**
     * ��ȡdtosmarketwattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDTOSMARKETWATTPRICE() {
        return dtosmarketwattprice;
    }

    /**
     * ����dtosmarketwattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDTOSMARKETWATTPRICE(JAXBElement<BigDecimal> value) {
        this.dtosmarketwattprice = value;
    }

    /**
     * ��ȡdtosmarketprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDTOSMARKETPRICE() {
        return dtosmarketprice;
    }

    /**
     * ����dtosmarketprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDTOSMARKETPRICE(JAXBElement<BigDecimal> value) {
        this.dtosmarketprice = value;
    }

    /**
     * ��ȡstobwattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSTOBWATTPRICE() {
        return stobwattprice;
    }

    /**
     * ����stobwattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSTOBWATTPRICE(JAXBElement<BigDecimal> value) {
        this.stobwattprice = value;
    }

    /**
     * ��ȡstobprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSTOBPRICE() {
        return stobprice;
    }

    /**
     * ����stobprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSTOBPRICE(JAXBElement<BigDecimal> value) {
        this.stobprice = value;
    }

    /**
     * ��ȡstobmarketwattprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSTOBMARKETWATTPRICE() {
        return stobmarketwattprice;
    }

    /**
     * ����stobmarketwattprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSTOBMARKETWATTPRICE(JAXBElement<BigDecimal> value) {
        this.stobmarketwattprice = value;
    }

    /**
     * ��ȡstobmarketprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSTOBMARKETPRICE() {
        return stobmarketprice;
    }

    /**
     * ����stobmarketprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSTOBMARKETPRICE(JAXBElement<BigDecimal> value) {
        this.stobmarketprice = value;
    }

    /**
     * ��ȡcommercialinvoice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMMERCIALINVOICE() {
        return commercialinvoice;
    }

    /**
     * ����commercialinvoice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMMERCIALINVOICE(JAXBElement<String> value) {
        this.commercialinvoice = value;
    }

    /**
     * ��ȡshipper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHIPPER() {
        return shipper;
    }

    /**
     * ����shipper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHIPPER(JAXBElement<String> value) {
        this.shipper = value;
    }

    /**
     * ��ȡcommercialinvoicedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMMERCIALINVOICEDATE() {
        return commercialinvoicedate;
    }

    /**
     * ����commercialinvoicedate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMMERCIALINVOICEDATE(JAXBElement<String> value) {
        this.commercialinvoicedate = value;
    }

    /**
     * ��ȡrebateflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREBATEFLAG() {
        return rebateflag;
    }

    /**
     * ����rebateflag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREBATEFLAG(JAXBElement<String> value) {
        this.rebateflag = value;
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

}
