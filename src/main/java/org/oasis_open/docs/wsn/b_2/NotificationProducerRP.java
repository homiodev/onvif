
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.oasis_open.docs.wsn.t_1.TopicSetType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"topicExpression", "fixedTopicSet", "topicExpressionDialect", "topicSet"})
@XmlRootElement(name = "NotificationProducerRP")
public class NotificationProducerRP {

    @XmlElement(name = "TopicExpression")
    protected List<TopicExpressionType> topicExpression;

    @XmlElement(name = "FixedTopicSet", defaultValue = "true")
    protected Boolean fixedTopicSet;

    @XmlElement(name = "TopicExpressionDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;

    @Getter @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1")
    protected TopicSetType topicSet;

    public List<TopicExpressionType> getTopicExpression() {
        if (topicExpression == null) {
            topicExpression = new ArrayList<TopicExpressionType>();
        }
        return this.topicExpression;
    }

    public Boolean isFixedTopicSet() {
        return fixedTopicSet;
    }

    public void setFixedTopicSet(Boolean value) {
        this.fixedTopicSet = value;
    }

    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<>();
        }
        return this.topicExpressionDialect;
    }

    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }
}
