
package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isolated" type="{http://www.opengis.net/gml/3.2}NodePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedEdge" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedTopoSolid" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}surfaceProperty" minOccurs="0"/&gt;
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
@XmlType(name = "FaceType", propOrder = {
    "isolated",
    "directedEdge",
    "directedTopoSolid",
    "surfaceProperty"
})
public class FaceType
    extends AbstractTopoPrimitiveType
{

    protected List<NodePropertyType> isolated;
    @XmlElement(required = true)
    protected List<DirectedEdgePropertyType> directedEdge;
    protected List<DirectedTopoSolidPropertyType> directedTopoSolid;
    protected SurfacePropertyType surfaceProperty;
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
     * {@link NodePropertyType }
     * 
     * 
     */
    public List<NodePropertyType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<NodePropertyType>();
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
     * Gets the value of the directedEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedEdgePropertyType }
     * 
     * 
     */
    public List<DirectedEdgePropertyType> getDirectedEdge() {
        if (directedEdge == null) {
            directedEdge = new ArrayList<DirectedEdgePropertyType>();
        }
        return this.directedEdge;
    }

    public boolean isSetDirectedEdge() {
        return ((this.directedEdge!= null)&&(!this.directedEdge.isEmpty()));
    }

    public void unsetDirectedEdge() {
        this.directedEdge = null;
    }

    /**
     * Gets the value of the directedTopoSolid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedTopoSolid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedTopoSolid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedTopoSolidPropertyType }
     * 
     * 
     */
    public List<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
        if (directedTopoSolid == null) {
            directedTopoSolid = new ArrayList<DirectedTopoSolidPropertyType>();
        }
        return this.directedTopoSolid;
    }

    public boolean isSetDirectedTopoSolid() {
        return ((this.directedTopoSolid!= null)&&(!this.directedTopoSolid.isEmpty()));
    }

    public void unsetDirectedTopoSolid() {
        this.directedTopoSolid = null;
    }

    /**
     * Gets the value of the surfaceProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getSurfaceProperty() {
        return surfaceProperty;
    }

    /**
     * Sets the value of the surfaceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setSurfaceProperty(SurfacePropertyType value) {
        this.surfaceProperty = value;
    }

    public boolean isSetSurfaceProperty() {
        return (this.surfaceProperty!= null);
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
