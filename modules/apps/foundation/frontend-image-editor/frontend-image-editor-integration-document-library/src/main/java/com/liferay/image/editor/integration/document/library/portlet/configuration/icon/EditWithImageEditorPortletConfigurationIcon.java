/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.image.editor.integration.document.library.portlet.configuration.icon;

import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.web.constants.DLPortletKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.configuration.icon.BaseJSPPortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.configuration.icon.PortletConfigurationIcon;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PropsValues;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Ambrin Chaudhary
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY_ADMIN,
		"path=/document_library/view_file_entry"
	},
	service = PortletConfigurationIcon.class
)
public class EditWithImageEditorPortletConfigurationIcon
	extends BaseJSPPortletConfigurationIcon {

	public static FileEntry getFileEntry(HttpServletRequest request)
		throws Exception {

		long fileEntryId = ParamUtil.getLong(request, "fileEntryId");

		FileEntry fileEntry = null;

		if (fileEntryId > 0) {
			fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
		}

		if (fileEntry == null) {
			return null;
		}

		String cmd = ParamUtil.getString(request, Constants.CMD);

		if (fileEntry.isInTrash() && !cmd.equals(Constants.MOVE_FROM_TRASH)) {
			throw new NoSuchFileEntryException(
				"{fileEntryId=" + fileEntryId + "}");
		}

		return fileEntry;
	}

	public static FileEntry getFileEntry(PortletRequest portletRequest)
		throws Exception {

		HttpServletRequest request = PortalUtil.getHttpServletRequest(
			portletRequest);

		return getFileEntry(request);
	}

	@Override
	public String getJspPath() {
		return "/image_editor/configuration/icon/edit_image_editor.jsp";
	}

	@Override
	public String getMessage(PortletRequest portletRequest) {
		return LanguageUtil.get(
			getResourceBundle(getLocale(portletRequest)),
			"edit-with-image-editor");
	}

	public String getURL(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		return "javascript:;";
	}

	@Override
	public double getWeight() {
		return 106;
	}

	@Override
	public boolean isShow(PortletRequest portletRequest) {
		try {
			ThemeDisplay themeDisplay =
				(ThemeDisplay)portletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			FileEntry fileEntry = getFileEntry(portletRequest);

			/*FileEntryDisplayContextHelper fileEntryDisplayContextHelper =
				new FileEntryDisplayContextHelper(
					themeDisplay.getPermissionChecker(), fileEntry);
*/
			if (/*fileEntryDisplayContextHelper.isEditActionAvailable() &&*/
					ArrayUtil.contains(
						PropsValues.DL_FILE_ENTRY_PREVIEW_IMAGE_MIME_TYPES,
						fileEntry.getMimeType())) {

				return true;
			}

			return false;
		}
		catch (Exception pe) {
		}

		return false;
	}

	@Override
	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.image.editor.integration.document.library)",
		unbind = "-"
	)
	public void setServletContext(ServletContext servletContext) {
		super.setServletContext(servletContext);
	}

}