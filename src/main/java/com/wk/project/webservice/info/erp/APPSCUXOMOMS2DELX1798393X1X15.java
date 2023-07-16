
package com.wk.project.webservice.info.erp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_OM_OMS2_DELX1798393X1X15 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_OM_OMS2_DELX1798393X1X15"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRODUCERREQUESTDATA_ITEM" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DELX1798393X1X16" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_OM_OMS2_DELX1798393X1X15", propOrder = {
    "producerrequestdataitem"
})
public class APPSCUXOMOMS2DELX1798393X1X15 {

    @XmlElement(name = "PRODUCERREQUESTDATA_ITEM", nillable = true)
    protected List<APPSCUXOMOMS2DELX1798393X1X16> producerrequestdataitem;

    /**
     * Gets the value of the producerrequestdataitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerrequestdataitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODUCERREQUESTDATAITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPSCUXOMOMS2DELX1798393X1X16 }
     * 
     * 
     */
    public List<APPSCUXOMOMS2DELX1798393X1X16> getPRODUCERREQUESTDATAITEM() {
        if (producerrequestdataitem == null) {
            producerrequestdataitem = new ArrayList<APPSCUXOMOMS2DELX1798393X1X16>();
        }
        return this.producerrequestdataitem;
    }

}
