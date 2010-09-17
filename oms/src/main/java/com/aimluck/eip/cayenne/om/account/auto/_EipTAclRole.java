/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2010 Aimluck,Inc.
 * http://aipostyle.com/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aimluck.eip.cayenne.om.account.auto;

import java.util.List;

/** Class _EipTAclRole was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTAclRole extends org.apache.cayenne.CayenneDataObject {

    public static final String ACL_TYPE_PROPERTY = "aclType";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String ROLE_NAME_PROPERTY = "roleName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TACL_PORTLET_FEATURE_PROPERTY = "eipTAclPortletFeature";
    public static final String EIP_TACL_USER_ROLE_MAPS_PROPERTY = "eipTAclUserRoleMaps";

    public static final String ROLE_ID_PK_COLUMN = "ROLE_ID";

    public void setAclType(Integer aclType) {
        writeProperty("aclType", aclType);
    }
    public Integer getAclType() {
        return (Integer)readProperty("aclType");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setRoleName(String roleName) {
        writeProperty("roleName", roleName);
    }
    public String getRoleName() {
        return (String)readProperty("roleName");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setEipTAclPortletFeature(com.aimluck.eip.cayenne.om.account.EipTAclPortletFeature eipTAclPortletFeature) {
        setToOneTarget("eipTAclPortletFeature", eipTAclPortletFeature, true);
    }

    public com.aimluck.eip.cayenne.om.account.EipTAclPortletFeature getEipTAclPortletFeature() {
        return (com.aimluck.eip.cayenne.om.account.EipTAclPortletFeature)readProperty("eipTAclPortletFeature");
    } 
    
    
    public void addToEipTAclUserRoleMaps(com.aimluck.eip.cayenne.om.account.EipTAclUserRoleMap obj) {
        addToManyTarget("eipTAclUserRoleMaps", obj, true);
    }
    public void removeFromEipTAclUserRoleMaps(com.aimluck.eip.cayenne.om.account.EipTAclUserRoleMap obj) {
        removeToManyTarget("eipTAclUserRoleMaps", obj, true);
    }
    public List getEipTAclUserRoleMaps() {
        return (List)readProperty("eipTAclUserRoleMaps");
    }
    
    
}
