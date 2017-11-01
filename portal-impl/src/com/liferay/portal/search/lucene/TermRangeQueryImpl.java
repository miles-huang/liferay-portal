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

package com.liferay.portal.search.lucene;

import com.liferay.portal.kernel.search.BaseQueryImpl;
import com.liferay.portal.kernel.search.TermRangeQuery;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Raymond Augé
 */
public class TermRangeQueryImpl extends BaseQueryImpl
	implements TermRangeQuery {

	public TermRangeQueryImpl(
		String field, String lowerTerm, String upperTerm, boolean includesLower,
		boolean includesUpper) {
		if ( field.endsWith("_Number_sortable")) {
			Double min = Validator.isNull(lowerTerm)?null:Double.parseDouble(lowerTerm);
			Double max = Validator.isNull(upperTerm)?null:Double.parseDouble(upperTerm);
			_numericRangeQuery = org.apache.lucene.search.NumericRangeQuery.newDoubleRange(
					field, min, max, includesLower, includesUpper);
		} else {
			_termRangeQuery = new org.apache.lucene.search.TermRangeQuery(
				field, lowerTerm, upperTerm, includesLower, includesUpper);
		}
	}

	@Override
	public String getField() {
		return _termRangeQuery == null?
				_numericRangeQuery.getField()
				:_termRangeQuery.getField();
	}

	@Override
	public String getLowerTerm() {
		return _termRangeQuery == null?
				(_numericRangeQuery.getMin()==null?null:_numericRangeQuery.getMin().toString())
				:_termRangeQuery.getLowerTerm();
	}

	public Object getTermRangeQuery() {
		return _termRangeQuery == null?_numericRangeQuery: _termRangeQuery;
	}

	@Override
	public String getUpperTerm() {
		return _termRangeQuery == null?
				(_numericRangeQuery.getMax()==null?null:_numericRangeQuery.getMax().toString())
				:_termRangeQuery.getUpperTerm();
	}

	@Override
	public Object getWrappedQuery() {
		return getTermRangeQuery();
	}

	@Override
	public boolean includesLower() {
		return _termRangeQuery == null?
				_numericRangeQuery.includesMin():
				_termRangeQuery.includesLower();
	}

	@Override
	public boolean includesUpper() {
		return _termRangeQuery == null?
				_numericRangeQuery.includesMax():
				_termRangeQuery.includesUpper();
	}

	@Override
	public String toString() {
		return _termRangeQuery == null? _numericRangeQuery.toString():_termRangeQuery.toString();
	}

	private org.apache.lucene.search.TermRangeQuery _termRangeQuery;
	private org.apache.lucene.search.NumericRangeQuery<Double> _numericRangeQuery;
}