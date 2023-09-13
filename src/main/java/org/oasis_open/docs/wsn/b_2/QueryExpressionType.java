
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "QueryExpressionType",
        propOrder = {"content"})
public class QueryExpressionType {

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    @Getter @XmlAttribute(name = "Dialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dialect;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public void setDialect(String value) {
        this.dialect = value;
    }
}
