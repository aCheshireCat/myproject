
package com.wk.project.webservice.info.erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_OM_OMS2_DEX1798393X1X105 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_OM_OMS2_DEX1798393X1X105"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STATUS" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string2400" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGEID" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="REQUEUE" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string30" minOccurs="0"/&gt;
 *         &lt;element name="ATTR1" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR2" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR3" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR4" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR5" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR6" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR7" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR8" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *         &lt;element name="ATTR9" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}string240" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_OM_OMS2_DEX1798393X1X105", propOrder = {
    "status",
    "code",
    "message",
    "messageid",
    "requeue",
    "attr1",
    "attr2",
    "attr3",
    "attr4",
    "attr5",
    "attr6",
    "attr7",
    "attr8",
    "attr9"
})
public class APPSCUXOMOMS2DEX1798393X1X105 {

    @XmlElementRef(name = "STATUS", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "CODE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "MESSAGE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "MESSAGEID", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageid;
    @XmlElementRef(name = "REQUEUE", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requeue;
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

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCODE() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCODE(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMESSAGE() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMESSAGE(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * ��ȡmessageid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMESSAGEID() {
        return messageid;
    }

    /**
     * ����messageid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMESSAGEID(JAXBElement<String> value) {
        this.messageid = value;
    }

    /**
     * ��ȡrequeue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREQUEUE() {
        return requeue;
    }

    /**
     * ����requeue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREQUEUE(JAXBElement<String> value) {
        this.requeue = value;
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

}
