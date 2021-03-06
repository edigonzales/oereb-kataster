
package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopoSolidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopoSolidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isolated" type="{http://www.opengis.net/gml/3.2}NodeOrEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}solidProperty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *       &lt;attribute name="universal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoSolidType", propOrder = {
    "isolated",
    "directedFace",
    "solidProperty"
})
public class TopoSolidType
    extends AbstractTopoPrimitiveType
{

    protected List<NodeOrEdgePropertyType> isolated;
    @XmlElement(required = true)
    protected List<DirectedFacePropertyType> directedFace;
    protected SolidPropertyType solidProperty;
    @XmlAttribute(name = "universal")
    protected java.lang.Boolean universal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the isolated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isolated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsolated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeOrEdgePropertyType }
     * 
     * 
     */
    public List<NodeOrEdgePropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<NodeOrEdgePropertyType>();
        }
        return this.isolated;
    }

    public boolean isSetIsolated() {
        return ((this.isolated!= null)&&(!this.isolated.isEmpty()));
    }

    public void unsetIsolated() {
        this.isolated = null;
    }

    /**
     * Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
     * 
     * 
     */
    public List<DirectedFacePropertyType> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<DirectedFacePropertyType>();
        }
        return this.directedFace;
    }

    public boolean isSetDirectedFace() {
        return ((this.directedFace!= null)&&(!this.directedFace.isEmpty()));
    }

    public void unsetDirectedFace() {
        this.directedFace = null;
    }

    /**
     * Gets the value of the solidProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getSolidProperty() {
        return solidProperty;
    }

    /**
     * Sets the value of the solidProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setSolidProperty(SolidPropertyType value) {
        this.solidProperty = value;
    }

    public boolean isSetSolidProperty() {
        return (this.solidProperty!= null);
    }

    /**
     * Gets the value of the universal property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isUniversal() {
        if (universal == null) {
            return false;
        } else {
            return universal;
        }
    }

    /**
     * Sets the value of the universal property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setUniversal(boolean value) {
        this.universal = value;
    }

    public boolean isSetUniversal() {
        return (this.universal!= null);
    }

    public void unsetUniversal() {
        this.universal = null;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
    }

}
