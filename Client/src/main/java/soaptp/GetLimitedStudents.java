
package soaptp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getLimitedStudents complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getLimitedStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLimitedStudents", propOrder = {
    "limit"
})
public class GetLimitedStudents {

    protected int limit;

    /**
     * Obtient la valeur de la propri�t� limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * D�finit la valeur de la propri�t� limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
