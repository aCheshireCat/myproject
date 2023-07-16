
package com.wk.project.webservice.info.erp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_OM_OMS2_DELX1798393X1X55 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_OM_OMS2_DELX1798393X1X55"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LINES_ITEM" type="{http://xmlns.oracle.com/pcbpel/adapter/db/sp/ErpAcceptPreSalesOrdersSoapBiz}APPS.CUX_OM_OMS2_DELX1798393X1X56" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_OM_OMS2_DELX1798393X1X55", propOrder = {
    "linesitem"
})
public class APPSCUXOMOMS2DELX1798393X1X55 {

    @XmlElement(name = "LINES_ITEM", nillable = true)
    protected List<APPSCUXOMOMS2DELX1798393X1X56> linesitem;

    /**
     * Gets the value of the linesitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linesitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLINESITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPSCUXOMOMS2DELX1798393X1X56 }
     * 
     * 
     */
    public List<APPSCUXOMOMS2DELX1798393X1X56> getLINESITEM() {
        if (linesitem == null) {
            linesitem = new ArrayList<APPSCUXOMOMS2DELX1798393X1X56>();
        }
        return this.linesitem;
    }

}
