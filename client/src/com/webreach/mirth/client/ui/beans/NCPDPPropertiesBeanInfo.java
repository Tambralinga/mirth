/*
 * EDIPropertiesBeanInfo.java
 *
 * Created on February 15, 2007, 6:12 PM
 */

package com.webreach.mirth.client.ui.beans;

import java.beans.*;

/**
 * @author brendanh
 */
public class NCPDPPropertiesBeanInfo extends SimpleBeanInfo
{
    
    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.webreach.mirth.client.ui.beans.NCPDPProperties.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        
        // Here you can add code for customizing the BeanDescriptor.
        
        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    
    
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_fieldDelimiter = 0;
    private static final int PROPERTY_groupDelimiter = 1;
    private static final int PROPERTY_segmentDelimiter = 2;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[3];
    
        try {
            properties[PROPERTY_fieldDelimiter] = new PropertyDescriptor ( "fieldDelimiter", com.webreach.mirth.client.ui.beans.NCPDPProperties.class, "getFieldDelimiter", "setFieldDelimiter" ); // NOI18N
            properties[PROPERTY_fieldDelimiter].setDisplayName ( "Field Delimiter" );
            properties[PROPERTY_fieldDelimiter].setShortDescription ( "Characters that delimit the fields in the message." );
            properties[PROPERTY_fieldDelimiter].setBound ( true );
            properties[PROPERTY_groupDelimiter] = new PropertyDescriptor ( "groupDelimiter", com.webreach.mirth.client.ui.beans.NCPDPProperties.class, "getGroupDelimiter", "setGroupDelimiter" ); // NOI18N
            properties[PROPERTY_groupDelimiter].setDisplayName ( "Group Delimiter" );
            properties[PROPERTY_groupDelimiter].setShortDescription ( "Characters that delimit the groups in the message." );
            properties[PROPERTY_groupDelimiter].setBound ( true );
            properties[PROPERTY_segmentDelimiter] = new PropertyDescriptor ( "segmentDelimiter", com.webreach.mirth.client.ui.beans.NCPDPProperties.class, "getSegmentDelimiter", "setSegmentDelimiter" ); // NOI18N
            properties[PROPERTY_segmentDelimiter].setDisplayName ( "Segment Delimiter" );
            properties[PROPERTY_segmentDelimiter].setShortDescription ( "Characters that delimit the segments in the message." );
            properties[PROPERTY_segmentDelimiter].setBound ( true );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        
        // Here you can add code for customizing the properties array.
        
        return properties;     }//GEN-LAST:Properties
    
    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        
        // Here you can add code for customizing the event sets array.
        
        return eventSets;     }//GEN-LAST:Events
    
    // Method identifiers//GEN-FIRST:Methods

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[0];//GEN-HEADEREND:Methods
        
        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    
    
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx
    
    
//GEN-FIRST:Superclass
    
    // Here you can add code for customizing the Superclass BeanInfo.
    
//GEN-LAST:Superclass
    
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor()
    {
        return getBdescriptor();
    }
    
    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors()
    {
        return getPdescriptor();
    }
    
    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return  An array of EventSetDescriptors describing the kinds of
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors()
    {
        return getEdescriptor();
    }
    
    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return  An array of MethodDescriptors describing the methods
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors()
    {
        return getMdescriptor();
    }
    
    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex()
    {
        return defaultPropertyIndex;
    }
    
    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean.
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex()
    {
        return defaultEventIndex;
    }
}

