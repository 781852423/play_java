//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.19 at 01:00:00 PM CST 
//


package v1.davenkin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import generated.Animal;


/**
 * <p>Java class for Zoo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zoo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zooName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zooId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="animals" type="{}Animal" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zoo", propOrder = {
    "zooName",
    "zooId",
    "animals"
})
public class Zoo {

    @XmlElement(required = true)
    protected String zooName;
    protected int zooId;
    @XmlElement(required = true)
    protected List<Animal> animals;

    /**
     * Gets the value of the zooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZooName() {
        return zooName;
    }

    /**
     * Sets the value of the zooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZooName(String value) {
        this.zooName = value;
    }

    /**
     * Gets the value of the zooId property.
     * 
     */
    public int getZooId() {
        return zooId;
    }

    /**
     * Sets the value of the zooId property.
     * 
     */
    public void setZooId(int value) {
        this.zooId = value;
    }

    /**
     * Gets the value of the animals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Animal }
     * 
     * 
     */
    public List<Animal> getAnimals() {
        if (animals == null) {
            animals = new ArrayList<Animal>();
        }
        return this.animals;
    }

}
