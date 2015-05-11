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

package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ListType service. Represents a row in the &quot;ListType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ListTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ListTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ListType
 * @see com.liferay.portal.model.impl.ListTypeImpl
 * @see com.liferay.portal.model.impl.ListTypeModelImpl
 * @generated
 */
@ProviderType
public interface ListTypeModel extends BaseModel<ListType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a list type model instance should use the {@link ListType} interface instead.
	 */

	/**
	 * Returns the primary key of this list type.
	 *
	 * @return the primary key of this list type
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this list type.
	 *
	 * @param primaryKey the primary key of this list type
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the list type ID of this list type.
	 *
	 * @return the list type ID of this list type
	 */
	public int getListTypeId();

	/**
	 * Sets the list type ID of this list type.
	 *
	 * @param listTypeId the list type ID of this list type
	 */
	public void setListTypeId(int listTypeId);

	/**
	 * Returns the name of this list type.
	 *
	 * @return the name of this list type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this list type.
	 *
	 * @param name the name of this list type
	 */
	public void setName(String name);

	/**
	 * Returns the type of this list type.
	 *
	 * @return the type of this list type
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this list type.
	 *
	 * @param type the type of this list type
	 */
	public void setType(String type);

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
	public int compareTo(com.liferay.portal.model.ListType listType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.model.ListType> toCacheModel();

	@Override
	public com.liferay.portal.model.ListType toEscapedModel();

	@Override
	public com.liferay.portal.model.ListType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}