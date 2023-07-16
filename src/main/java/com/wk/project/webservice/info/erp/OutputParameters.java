
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
 *         &lt;element name="CONSUMERRESPONSEDATA" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DEX1798393X1X105" minOccurs="0"/&gt;
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
    "consumerresponsedata"
})
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "CONSUMERRESPONSEDATA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz", type = JAXBElement.class, required = false)
    protected JAXBElement<APPSCUXOMOMS2DEX1798393X1X105> consumerresponsedata;

    /**
     * ��ȡconsumerresponsedata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DEX1798393X1X105 }{@code >}
     *     
     */
    public JAXBElement<APPSCUXOMOMS2DEX1798393X1X105> getCONSUMERRESPONSEDATA() {
        return consumerresponsedata;
    }

    /**
     * ����consumerresponsedata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXOMOMS2DEX1798393X1X105 }{@code >}
     *     
     */
    public void setCONSUMERRESPONSEDATA(JAXBElement<APPSCUXOMOMS2DEX1798393X1X105> value) {
        this.consumerresponsedata = value;
    }

}
