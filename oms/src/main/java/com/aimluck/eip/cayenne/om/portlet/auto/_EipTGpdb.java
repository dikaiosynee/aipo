package com.aimluck.eip.cayenne.om.portlet.auto;

import java.util.List;

/** Class _EipTGpdb was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTGpdb extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String GPDB_NAME_PROPERTY = "gpdbName";
    public static final String MAIL_FLG_PROPERTY = "mailFlg";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TGPDB_ITEM_PROPERTY = "eipTGpdbItem";
    public static final String EIP_TGPDB_RECORD_PROPERTY = "eipTGpdbRecord";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String GPDB_ID_PK_COLUMN = "GPDB_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setGpdbName(String gpdbName) {
        writeProperty("gpdbName", gpdbName);
    }
    public String getGpdbName() {
        return (String)readProperty("gpdbName");
    }
    
    
    public void setMailFlg(String mailFlg) {
        writeProperty("mailFlg", mailFlg);
    }
    public String getMailFlg() {
        return (String)readProperty("mailFlg");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTGpdbItem(com.aimluck.eip.cayenne.om.portlet.EipTGpdbItem obj) {
        addToManyTarget("eipTGpdbItem", obj, true);
    }
    public void removeFromEipTGpdbItem(com.aimluck.eip.cayenne.om.portlet.EipTGpdbItem obj) {
        removeToManyTarget("eipTGpdbItem", obj, true);
    }
    public List getEipTGpdbItem() {
        return (List)readProperty("eipTGpdbItem");
    }
    
    
    public void addToEipTGpdbRecord(com.aimluck.eip.cayenne.om.portlet.EipTGpdbRecord obj) {
        addToManyTarget("eipTGpdbRecord", obj, true);
    }
    public void removeFromEipTGpdbRecord(com.aimluck.eip.cayenne.om.portlet.EipTGpdbRecord obj) {
        removeToManyTarget("eipTGpdbRecord", obj, true);
    }
    public List getEipTGpdbRecord() {
        return (List)readProperty("eipTGpdbRecord");
    }
    
    
    public void setTurbineUser(com.aimluck.eip.cayenne.om.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getTurbineUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
