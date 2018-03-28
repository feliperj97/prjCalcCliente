
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Somar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Somar", propOrder = {
    "a",
    "b"
})
public class Somar {

    protected float a;
    protected float b;

    /**
     * Obt�m o valor da propriedade a.
     * 
     */
    public float getA() {
        return a;
    }

    /**
     * Define o valor da propriedade a.
     * 
     */
    public void setA(float value) {
        this.a = value;
    }

    /**
     * Obt�m o valor da propriedade b.
     * 
     */
    public float getB() {
        return b;
    }

    /**
     * Define o valor da propriedade b.
     * 
     */
    public void setB(float value) {
        this.b = value;
    }

}
