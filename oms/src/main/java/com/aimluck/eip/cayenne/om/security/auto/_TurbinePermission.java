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

package com.aimluck.eip.cayenne.om.security.auto;

import java.util.List;

/** Class _TurbinePermission was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _TurbinePermission extends org.apache.cayenne.CayenneDataObject {

    public static final String OBJECTDATA_PROPERTY = "OBJECTDATA";
    public static final String PERMISSION_NAME_PROPERTY = "permissionName";
    public static final String TURBINE_ROLE_PERMISSION_PROPERTY = "turbineRolePermission";

    public static final String PERMISSION_ID_PK_COLUMN = "PERMISSION_ID";

    public void setOBJECTDATA(byte[] OBJECTDATA) {
        writeProperty("OBJECTDATA", OBJECTDATA);
    }
    public byte[] getOBJECTDATA() {
        return (byte[])readProperty("OBJECTDATA");
    }
    
    
    public void setPermissionName(String permissionName) {
        writeProperty("permissionName", permissionName);
    }
    public String getPermissionName() {
        return (String)readProperty("permissionName");
    }
    
    
    public void addToTurbineRolePermission(com.aimluck.eip.cayenne.om.security.TurbineRolePermission obj) {
        addToManyTarget("turbineRolePermission", obj, true);
    }
    public void removeFromTurbineRolePermission(com.aimluck.eip.cayenne.om.security.TurbineRolePermission obj) {
        removeToManyTarget("turbineRolePermission", obj, true);
    }
    public List getTurbineRolePermission() {
        return (List)readProperty("turbineRolePermission");
    }
    
    
}
