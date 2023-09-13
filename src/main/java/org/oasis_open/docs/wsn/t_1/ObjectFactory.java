
package org.oasis_open.docs.wsn.t_1;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _TopicSet_QNAME =
            new QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
    private static final QName _TopicNamespace_QNAME =
            new QName("http://docs.oasis-open.org/wsn/t-1", "TopicNamespace");

    public ObjectFactory() {
    }

    public TopicNamespaceType createTopicNamespaceType() {
        return new TopicNamespaceType();
    }

    public TopicSetType createTopicSetType() {
        return new TopicSetType();
    }

    public Documentation createDocumentation() {
        return new Documentation();
    }

    public TopicType createTopicType() {
        return new TopicType();
    }

    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    public TopicNamespaceType.Topic createTopicNamespaceTypeTopic() {
        return new TopicNamespaceType.Topic();
    }

    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicSet")
    public JAXBElement<TopicSetType> createTopicSet(TopicSetType value) {
        return new JAXBElement<TopicSetType>(_TopicSet_QNAME, TopicSetType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicNamespace")
    public JAXBElement<TopicNamespaceType> createTopicNamespace(TopicNamespaceType value) {
        return new JAXBElement<TopicNamespaceType>(
                _TopicNamespace_QNAME, TopicNamespaceType.class, null, value);
    }
}
