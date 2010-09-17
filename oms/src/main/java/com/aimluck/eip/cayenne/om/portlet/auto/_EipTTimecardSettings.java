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

package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTTimecardSettings was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTTimecardSettings extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String END_HOUR_PROPERTY = "endHour";
    public static final String END_MINUTE_PROPERTY = "endMinute";
    public static final String RESTTIME_IN_PROPERTY = "resttimeIn";
    public static final String RESTTIME_OUT_PROPERTY = "resttimeOut";
    public static final String START_HOUR_PROPERTY = "startHour";
    public static final String START_MINUTE_PROPERTY = "startMinute";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String WORKTIME_IN_PROPERTY = "worktimeIn";
    public static final String WORKTIME_OUT_PROPERTY = "worktimeOut";

    public static final String TIMECARD_SETTINGS_ID_PK_COLUMN = "TIMECARD_SETTINGS_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setEndHour(Integer endHour) {
        writeProperty("endHour", endHour);
    }
    public Integer getEndHour() {
        return (Integer)readProperty("endHour");
    }
    
    
    public void setEndMinute(Integer endMinute) {
        writeProperty("endMinute", endMinute);
    }
    public Integer getEndMinute() {
        return (Integer)readProperty("endMinute");
    }
    
    
    public void setResttimeIn(Integer resttimeIn) {
        writeProperty("resttimeIn", resttimeIn);
    }
    public Integer getResttimeIn() {
        return (Integer)readProperty("resttimeIn");
    }
    
    
    public void setResttimeOut(Integer resttimeOut) {
        writeProperty("resttimeOut", resttimeOut);
    }
    public Integer getResttimeOut() {
        return (Integer)readProperty("resttimeOut");
    }
    
    
    public void setStartHour(Integer startHour) {
        writeProperty("startHour", startHour);
    }
    public Integer getStartHour() {
        return (Integer)readProperty("startHour");
    }
    
    
    public void setStartMinute(Integer startMinute) {
        writeProperty("startMinute", startMinute);
    }
    public Integer getStartMinute() {
        return (Integer)readProperty("startMinute");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setWorktimeIn(Integer worktimeIn) {
        writeProperty("worktimeIn", worktimeIn);
    }
    public Integer getWorktimeIn() {
        return (Integer)readProperty("worktimeIn");
    }
    
    
    public void setWorktimeOut(Integer worktimeOut) {
        writeProperty("worktimeOut", worktimeOut);
    }
    public Integer getWorktimeOut() {
        return (Integer)readProperty("worktimeOut");
    }
    
    
}
