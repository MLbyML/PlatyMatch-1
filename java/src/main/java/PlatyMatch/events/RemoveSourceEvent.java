/*-
 * #%L
 * UI for BigDataViewer.
 * %%
 * Copyright (C) 2017 - 2018 Tim-Oliver Buchholz
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
package PlatyMatch.events;

import org.scijava.event.SciJavaEvent;

import bdv.BigDataViewer;

/**
 *
 * Remove source from {@link BigDataViewer}.
 *
 * @author Tim-Oliver Buchholz, CSBD/MPI-CBG Dresden
 *
 */
public class RemoveSourceEvent extends SciJavaEvent {

	/**
	 * Name of the source to remove.
	 */
	private final String sourceName;

	/**
	 * Index of the source to remove.
	 */
	private final int index;

	/**
	 * Remove source.
	 *
	 * @param sourceName to remove
	 * @param index to remove
	 */
	public RemoveSourceEvent(final String sourceName, final int index) {
		this.sourceName = sourceName;
		this.index = index;
	}

	/**
	 *
	 * @return name of the source to remove
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 *
	 * @return index of the source to remove
	 */
	public int getSourceIndex() {
		return index;
	}
}
