package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ObjectTree",
        propOrder = {"rename", "split", "merge", "delete", "extension"})
public class ObjectTree {

    @XmlElement(name = "Rename")
    protected List<Rename> rename;

    @XmlElement(name = "Split")
    protected List<Split> split;

    @XmlElement(name = "Merge")
    protected List<Merge> merge;

    @XmlElement(name = "Delete")
    protected List<ObjectId> delete;

    @Getter @XmlElement(name = "Extension")
    protected ObjectTreeExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Rename> getRename() {
        if (rename == null) {
            rename = new ArrayList<Rename>();
        }
        return this.rename;
    }

    public List<Split> getSplit() {
        if (split == null) {
            split = new ArrayList<Split>();
        }
        return this.split;
    }

    public List<Merge> getMerge() {
        if (merge == null) {
            merge = new ArrayList<Merge>();
        }
        return this.merge;
    }

    public List<ObjectId> getDelete() {
        if (delete == null) {
            delete = new ArrayList<ObjectId>();
        }
        return this.delete;
    }

    public void setExtension(ObjectTreeExtension value) {
        this.extension = value;
    }
}
