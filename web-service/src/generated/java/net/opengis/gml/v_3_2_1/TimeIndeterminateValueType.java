
package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeIndeterminateValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeIndeterminateValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="after"/&gt;
 *     &lt;enumeration value="before"/&gt;
 *     &lt;enumeration value="now"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeIndeterminateValueType")
@XmlEnum
public enum TimeIndeterminateValueType {

    @XmlEnumValue("after")
    AFTER("after"),
    @XmlEnumValue("before")
    BEFORE("before"),
    @XmlEnumValue("now")
    NOW("now"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TimeIndeterminateValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeIndeterminateValueType fromValue(String v) {
        for (TimeIndeterminateValueType c: TimeIndeterminateValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
