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

/** Class _EipTMail was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTMail extends org.apache.cayenne.CayenneDataObject {

    public static final String ACCOUNT_ID_PROPERTY = "accountId";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String EVENT_DATE_PROPERTY = "eventDate";
    public static final String FILE_PATH_PROPERTY = "filePath";
    public static final String FILE_VOLUME_PROPERTY = "fileVolume";
    public static final String FOLDER_ID_PROPERTY = "folderId";
    public static final String HAS_FILES_PROPERTY = "hasFiles";
    public static final String MAIL_PROPERTY = "mail";
    public static final String PERSON_PROPERTY = "person";
    public static final String READ_FLG_PROPERTY = "readFlg";
    public static final String SUBJECT_PROPERTY = "subject";
    public static final String TYPE_PROPERTY = "type";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";

    public static final String MAIL_ID_PK_COLUMN = "MAIL_ID";

    public void setAccountId(Integer accountId) {
        writeProperty("accountId", accountId);
    }
    public Integer getAccountId() {
        return (Integer)readProperty("accountId");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setEventDate(java.util.Date eventDate) {
        writeProperty("eventDate", eventDate);
    }
    public java.util.Date getEventDate() {
        return (java.util.Date)readProperty("eventDate");
    }
    
    
    public void setFilePath(String filePath) {
        writeProperty("filePath", filePath);
    }
    public String getFilePath() {
        return (String)readProperty("filePath");
    }
    
    
    public void setFileVolume(Integer fileVolume) {
        writeProperty("fileVolume", fileVolume);
    }
    public Integer getFileVolume() {
        return (Integer)readProperty("fileVolume");
    }
    
    
    public void setFolderId(Integer folderId) {
        writeProperty("folderId", folderId);
    }
    public Integer getFolderId() {
        return (Integer)readProperty("folderId");
    }
    
    
    public void setHasFiles(String hasFiles) {
        writeProperty("hasFiles", hasFiles);
    }
    public String getHasFiles() {
        return (String)readProperty("hasFiles");
    }
    
    
    public void setMail(byte[] mail) {
        writeProperty("mail", mail);
    }
    public byte[] getMail() {
        return (byte[])readProperty("mail");
    }
    
    
    public void setPerson(String person) {
        writeProperty("person", person);
    }
    public String getPerson() {
        return (String)readProperty("person");
    }
    
    
    public void setReadFlg(String readFlg) {
        writeProperty("readFlg", readFlg);
    }
    public String getReadFlg() {
        return (String)readProperty("readFlg");
    }
    
    
    public void setSubject(String subject) {
        writeProperty("subject", subject);
    }
    public String getSubject() {
        return (String)readProperty("subject");
    }
    
    
    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
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
    
    
}
