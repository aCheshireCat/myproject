
package com.wk.project.webservice.info.erp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRODUCERREQUESTHEAD" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DELIX1798393X1X1" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCERREQUESTDATA" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DELX1798393X1X15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "producerrequesthead",
    "producerrequestdata"
})
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "PRODUCERREQUESTHEAD", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<APPSCUXOMOMS2DELIX1798393X1X1> producerrequesthead;
    @XmlElementRef(name = "PRODUCERREQUESTDATA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<APPSCUXOMOMS2DELX1798393X1X15> producerrequestdata;

    /**
     * ��ȡproducerrequesthead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELIX1798393X1X1 }{@code >}
     *     
     */
    public JAXBElement<APPSCUXOMOMS2DELIX1798393X1X1> getPRODUCERREQUESTHEAD() {
        return producerrequesthead;
    }

    /**
     * ����producerrequesthead���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELIX1798393X1X1 }{@code >}
     *     
     */
    public void setPRODUCERREQUESTHEAD(JAXBElement<APPSCUXOMOMS2DELIX1798393X1X1> value) {
        this.producerrequesthead = value;
    }

    /**
     * ��ȡproducerrequestdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELX1798393X1X15 }{@code >}
     *     
     */
    public JAXBElement<APPSCUXOMOMS2DELX1798393X1X15> getPRODUCERREQUESTDATA() {
        return producerrequestdata;
    }

    /**
     * ����producerrequestdata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DELX1798393X1X15 }{@code >}
     *     
     */
    public void setPRODUCERREQUESTDATA(JAXBElement<APPSCUXOMOMS2DELX1798393X1X15> value) {
        this.producerrequestdata = value;
    }

}
