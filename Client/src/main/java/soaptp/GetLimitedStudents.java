
package soaptp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getLimitedStudents complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Définit la valeur de la propriété limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
