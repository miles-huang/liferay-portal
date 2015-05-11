/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DLFileShortcut service. Represents a row in the &quot;DLFileShortcut&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLFileShortcut
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutModelImpl
 * @generated
 */
@ProviderType
public interface DLFileShortcutModel extends BaseModel<DLFileShortcut>,
	StagedGroupedModel, TrashedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a document library file shortcut model instance should use the {@link DLFileShortcut} interface instead.
	 */

	/**
	 * Returns the primary key of this document library file shortcut.
	 *
	 * @return the primary key of this document library file shortcut
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this document library file shortcut.
	 *
	 * @param primaryKey the primary key of this document library file shortcut
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this document library file shortcut.
	 *
	 * @return the uuid of this document library file shortcut
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this document library file shortcut.
	 *
	 * @param uuid the uuid of this document library file shortcut
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the file shortcut ID of this document library file shortcut.
	 *
	 * @return the file shortcut ID of this document library file shortcut
	 */
	public long getFileShortcutId();

	/**
	 * Sets the file shortcut ID of this document library file shortcut.
	 *
	 * @param fileShortcutId the file shortcut ID of this document library file shortcut
	 */
	public void setFileShortcutId(long fileShortcutId);

	/**
	 * Returns the group ID of this document library file shortcut.
	 *
	 * @return the group ID of this document library file shortcut
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this document library file shortcut.
	 *
	 * @param groupId the group ID of this document library file shortcut
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this document library file shortcut.
	 *
	 * @return the company ID of this document library file shortcut
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this document library file shortcut.
	 *
	 * @param companyId the company ID of this document library file shortcut
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this document library file shortcut.
	 *
	 * @return the user ID of this document library file shortcut
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this document library file shortcut.
	 *
	 * @param userId the user ID of this document library file shortcut
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this document library file shortcut.
	 *
	 * @return the user uuid of this document library file shortcut
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this document library file shortcut.
	 *
	 * @param userUuid the user uuid of this document library file shortcut
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this document library file shortcut.
	 *
	 * @return the user name of this document library file shortcut
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this document library file shortcut.
	 *
	 * @param userName the user name of this document library file shortcut
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this document library file shortcut.
	 *
	 * @return the create date of this document library file shortcut
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this document library file shortcut.
	 *
	 * @param createDate the create date of this document library file shortcut
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this document library file shortcut.
	 *
	 * @return the modified date of this document library file shortcut
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this document library file shortcut.
	 *
	 * @param modifiedDate the modified date of this document library file shortcut
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the repository ID of this document library file shortcut.
	 *
	 * @return the repository ID of this document library file shortcut
	 */
	public long getRepositoryId();

	/**
	 * Sets the repository ID of this document library file shortcut.
	 *
	 * @param repositoryId the repository ID of this document library file shortcut
	 */
	public void setRepositoryId(long repositoryId);

	/**
	 * Returns the folder ID of this document library file shortcut.
	 *
	 * @return the folder ID of this document library file shortcut
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this document library file shortcut.
	 *
	 * @param folderId the folder ID of this document library file shortcut
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the to file entry ID of this document library file shortcut.
	 *
	 * @return the to file entry ID of this document library file shortcut
	 */
	public long getToFileEntryId();

	/**
	 * Sets the to file entry ID of this document library file shortcut.
	 *
	 * @param toFileEntryId the to file entry ID of this document library file shortcut
	 */
	public void setToFileEntryId(long toFileEntryId);

	/**
	 * Returns the tree path of this document library file shortcut.
	 *
	 * @return the tree path of this document library file shortcut
	 */
	@AutoEscape
	public String getTreePath();

	/**
	 * Sets the tree path of this document library file shortcut.
	 *
	 * @param treePath the tree path of this document library file shortcut
	 */
	public void setTreePath(String treePath);

	/**
	 * Returns the active of this document library file shortcut.
	 *
	 * @return the active of this document library file shortcut
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this document library file shortcut is active.
	 *
	 * @return <code>true</code> if this document library file shortcut is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this document library file shortcut is active.
	 *
	 * @param active the active of this document library file shortcut
	 */
	public void setActive(boolean active);

	/**
	 * Returns the status of this document library file shortcut.
	 *
	 * @return the status of this document library file shortcut
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this document library file shortcut.
	 *
	 * @param status the status of this document library file shortcut
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this document library file shortcut.
	 *
	 * @return the status by user ID of this document library file shortcut
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this document library file shortcut.
	 *
	 * @param statusByUserId the status by user ID of this document library file shortcut
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this document library file shortcut.
	 *
	 * @return the status by user uuid of this document library file shortcut
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this document library file shortcut.
	 *
	 * @param statusByUserUuid the status by user uuid of this document library file shortcut
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this document library file shortcut.
	 *
	 * @return the status by user name of this document library file shortcut
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this document library file shortcut.
	 *
	 * @param statusByUserName the status by user name of this document library file shortcut
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this document library file shortcut.
	 *
	 * @return the status date of this document library file shortcut
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this document library file shortcut.
	 *
	 * @param statusDate the status date of this document library file shortcut
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the trash entry created when this document library file shortcut was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this document library file shortcut.
	 *
	 * @return the trash entry created when this document library file shortcut was moved to the Recycle Bin
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrashEntry getTrashEntry() throws PortalException, SystemException;

	/**
	 * Returns the class primary key of the trash entry for this document library file shortcut.
	 *
	 * @return the class primary key of the trash entry for this document library file shortcut
	 */
	@Override
	public long getTrashEntryClassPK();

	/**
	 * Returns the trash handler for this document library file shortcut.
	 *
	 * @return the trash handler for this document library file shortcut
	 */
	@Override
	public TrashHandler getTrashHandler();

	/**
	 * Returns <code>true</code> if this document library file shortcut is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this document library file shortcut is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash();

	/**
	 * Returns <code>true</code> if the parent of this document library file shortcut is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this document library file shortcut is in the Recycle Bin; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean isInTrashContainer();

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this document library file shortcut is approved.
	 *
	 * @return <code>true</code> if this document library file shortcut is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this document library file shortcut is denied.
	 *
	 * @return <code>true</code> if this document library file shortcut is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this document library file shortcut is a draft.
	 *
	 * @return <code>true</code> if this document library file shortcut is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this document library file shortcut is expired.
	 *
	 * @return <code>true</code> if this document library file shortcut is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this document library file shortcut is inactive.
	 *
	 * @return <code>true</code> if this document library file shortcut is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this document library file shortcut is incomplete.
	 *
	 * @return <code>true</code> if this document library file shortcut is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this document library file shortcut is pending.
	 *
	 * @return <code>true</code> if this document library file shortcut is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this document library file shortcut is scheduled.
	 *
	 * @return <code>true</code> if this document library file shortcut is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.portlet.documentlibrary.model.DLFileShortcut dlFileShortcut);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.documentlibrary.model.DLFileShortcut> toCacheModel();

	@Override
	public com.liferay.portlet.documentlibrary.model.DLFileShortcut toEscapedModel();

	@Override
	public com.liferay.portlet.documentlibrary.model.DLFileShortcut toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}